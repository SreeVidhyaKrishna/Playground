#include <stdio.h>
int main() {
	int n, sd;
  scanf("%d",&n);
  while(n>10)
  {
    sd=n%10;
    n/=10;
  }
  printf("%d",sd);
	return 0;
}