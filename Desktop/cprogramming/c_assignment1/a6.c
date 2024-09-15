#include<stdio.h>
int main(void){
    float c;
    float f;
    printf("enter the temperature in faren ");
    scanf("%f  ",&f );
    c = (f - 32) * 5 / 9;
printf("to change the temp from faren %f to celcius %f ",c);
    scanf("%f  ",&c);
    f=9/5*c+32;
printf("to change the temp from celcius  %f to faren %f",f);
return 0;

}