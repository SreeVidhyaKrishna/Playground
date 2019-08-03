#include<stdio.h>
int main()
{
  int n,  num, i;
  scanf("%d", &n);
    int a[n];
  for( i = 0; i <n; i++)
  {
    scanf("%d", &a[i]);
  }
  scanf("%d", &num);
  for(i=0; i<n; i++)
  {
    if(a[i] == num)
    {   printf("%d", i+1);
     return 0;
    }
  }
    printf("%d isn't present in the array.", num);
  return 0;
}