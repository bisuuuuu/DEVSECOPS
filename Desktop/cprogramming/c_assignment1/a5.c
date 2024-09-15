#include<stdio.h>
int main(void){
    float total_percentage;
    float mark;
    float total_mark=500.0;
    float a,b,c,d,e;
    printf("enter marks of 5 subjects ");
    scanf("%f %f %f %f %f", &a,&b,&c,&d,&e);
mark=a+b+c+d+e;
total_percentage=mark/total_mark*100;
printf("total precentage of bisu is %f\n",total_percentage);
return 0;


}