#include<stdio.h>
#include<math.h>
int main(void){
    int a;
   float power_function;
    printf("enter the positive integer ");
scanf("%d ",&a);
power_function=pow(a,1)+pow(a,2)+pow(a,3);
power_function=a+a*a+a*a*a;
printf("the sum of first three powers %f (a+a*a+a*a*a)",power_function);
return 0;


}