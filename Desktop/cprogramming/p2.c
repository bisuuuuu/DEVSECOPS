#include<stdio.h>
int main(void){
int a,b;
float sum;
float average;
scanf("%d %d",&a,&b);
printf("enter 3 no  %d %d\n",a,b);
sum =(int)a+b;
 average=(float)(a+b)/2;
printf("input two no %f %f\n",sum,average);
return 0;
}