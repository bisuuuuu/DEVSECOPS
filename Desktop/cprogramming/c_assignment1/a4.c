#include<stdio.h>
int main(void){
    float simple_intrest;
    float p;
    float r;
    float t;
    printf("enter the p r and t");
    scanf("%f %f %f",&p,&r,&t );
     simple_intrest=(p*r*t)/100;
    printf("simple intrest is  %f",simple_intrest);
return 0;


}