#include<stdio.h>
int main(){
int a,b,c;
int sum;
printf("enter angles");
scanf("%d%d%d",&a,&b,&c);
sum=a+b+c;
if(sum==180){
printf("triangle is valid %d\n",sum);
}
else{
printf(" not valid %d\n",sum);
}
return 0;
}