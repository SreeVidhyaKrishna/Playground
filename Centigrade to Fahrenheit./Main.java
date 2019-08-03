#include<stdio.h>
int main()
{
  float a, b;
  scanf("%f", &a);
  b = (float)(a*9/5+32);
  printf("%.2f", b);
  return 0;
}