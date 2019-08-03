#include<stdio.h>
int main()
{
  int num,rem,quo,sum;
  scanf("%d",&num);
  quo=num/100;
  rem=num%10;
  printf("%d",quo+rem);
  return 0;
}