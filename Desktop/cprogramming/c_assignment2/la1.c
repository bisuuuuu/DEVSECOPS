#include<stdio.h>
int main(){
int a;
printf("enter number");
scanf("%d",&a);
if (a==0){
printf("print zero");
}
if (a>0){
printf("its a psotive number");    
}
if (a<0){
printf("its a negative number");    
}
return 0;
}