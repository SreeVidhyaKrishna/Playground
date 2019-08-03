#include <stdio.h>
int main() {
	int n, fd=0, ld=0, sum=0;
  scanf("%d",&n);
  ld=n%10;
  while(n>0)
  {
    fd=n%10;
    n/=10;
  }
  sum = fd + ld;
  printf("%d",sum);
	return 0;
}