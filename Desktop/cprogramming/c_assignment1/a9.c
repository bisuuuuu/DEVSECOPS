#include<stdio.h>
#define PI 3.14
int main(void){
    float area;
    float circumference;
    float r;
scanf("%f", &r);
area=PI*r*r;
circumference=2*PI*r;
printf("the area of circle is  %f and circumference is %f\n",area,circumference);
return 0;


}