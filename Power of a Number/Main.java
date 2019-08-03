#include <stdio.h>
int main()
{
  	int base, exponent, i, result = 1;
  scanf("%d %d", &base, &exponent);
  if(exponent <0)
    printf("Wrong input");
  else
  {
    for(i = 0; i<exponent; i++)
    {
      result = result * base;
    }
    printf("%d", result);
  }
    return 0;
}