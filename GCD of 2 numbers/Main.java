// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int num_1, num_2, small, gcd = 0;
  scanf("%d %d", &num_1, &num_2);
  if(num_1<num_2)
    small = num_1;
  else
    small = num_2;
  for(int i=1; i <= small; i++)
  {
    if(num_1 % i == 0 && num_2 % i == 0)
      gcd = i;
  }
  printf("%d", gcd);
   return 0;
}