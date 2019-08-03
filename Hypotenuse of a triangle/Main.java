#include<stdio.h>
#include<math.h>
int main()
{
  float opp_side, adj_side;
  scanf("%f %f", &opp_side, &adj_side);
  printf("%.2f", sqrt(opp_side*opp_side + adj_side*adj_side));
  return 0;
}