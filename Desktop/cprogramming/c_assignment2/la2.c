#include<stdio.h>
int main(){
int a,b,c;
printf("enter numbers");
scanf("%d %d %d",&a,&b,&c);
if(a>b && a>c){
printf("a is the largest");    
}
if(b>c && b>a){
printf("b is the largest");    
}
if(c>b && c>a){
printf("c is the largest");    
}

return 0;
}