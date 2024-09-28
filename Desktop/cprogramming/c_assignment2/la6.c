#include<stdio.h>
int main(){
int a;
printf("enter age");
scanf("%d",&a);
if(a>=18){
    printf("yes u can vote");
}
else{
    printf("you cant vote");
}
return 0;
}