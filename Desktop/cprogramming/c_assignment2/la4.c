#include<stdio.h>
int main(){
int a;
printf("enter number");
scanf("%d",&a);
if(a%5==0 && a%11==0){
printf("no is divisible with 5 and 11");    
}
else{
printf("not divisible");    
}
return 0;
}