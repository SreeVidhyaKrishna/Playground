#include<stdio.h>
int main()
{
  float radius, centre_angle;
  scanf("%f %f", &radius, &centre_angle);
  printf("%.2f",2*3.14*radius*(centre_angle/360));
  return 0;
 }