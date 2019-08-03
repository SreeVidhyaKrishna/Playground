#include<stdio.h>
int main()
{
 int num_1, num_2, i, gcd, lcm, small;
  scanf("%d %d", &num_1, &num_2);
  small = num_1<num_2?num_1:num_2;
  for(i = small; i >= 1; i--)
  {
    if(num_1 % i == 0 && num_2 % i == 0)
    {
      gcd = i;
      break;
    }
  }
  lcm = (num_1 * num_2)/gcd;
  printf("%d", lcm);
  return 0;
}