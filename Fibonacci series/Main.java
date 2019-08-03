#include<stdio.h>
int main()
{
  int n, a = 0, b = 1, c = 0;
  scanf("%d", &n);
  printf("%d ", a);
  printf("%d ", b);
  for(int i = 2; i < n; i++)
  {
    c = a + b;
    a = b;
    b = c;
    printf("%d ", c);
  }
  return 0;
}