// #include <stdio.h>
#define MAX 50
int tree[MAX];
void inorder(int i) {
if (tree[i] == -1 || i >= MAX) return;
inorder(2 * i);
printf("%d ", tree[i]);
inorder(2 * i + 1);
}
void preorder(int i) {
if (tree[i] == -1 || i >= MAX) return;
printf("%d ", tree[i]);
preorder(2 * i);
preorder(2 * i + 1);
}
void postorder(int i) {
if (tree[i] == -1 || i >= MAX) return;
postorder(2 * i);
postorder(2 * i + 1);
printf("%d ", tree[i]);
}
int leafCount(int i) {
if (tree[i] == -1 || i >= MAX) return 0;
if (tree[2 * i] == -1 && tree[2 * i + 1] == -1) return 1;
return leafCount(2 * i) + leafCount(2 * i + 1);
}
void ancestors(int idx) {
printf("Ancestors of %d: ", tree[idx]);
while (idx > 1) {
idx /= 2;
if (tree[idx] != -1) printf("%d ", tree[idx]);
}
printf("\n");
}
void isValid(int idx) {
if (idx < MAX && tree[idx] != -1)
printf("Index %d is VALID\n", idx);
else
printf("Index %d is INVALID\n", idx);
}
int main() {
int n;
printf("Enter number of elements in level order: ");
scanf("%d", &n);
printf("Enter elements (-1 for NULL): ");
for (int i = 1; i <= n; i++) scanf("%d", &tree[i]);
for (int i = n + 1; i < MAX; i++) tree[i] = -1;
printf("\nInorder: ");
inorder(1);
printf("\nPreorder: ");
preorder(1);
printf("\nPostorder: ");
postorder(1);
printf("\nLeaf Count: %d\n"
, leafCount(1));
int idx;
printf("\nEnter index to find ancestors: ");
scanf("%d", &idx);
ancestors(idx);
printf("Enter index to check validity: ");
scanf("%d", &idx);
isValid(idx);
return 0;
}