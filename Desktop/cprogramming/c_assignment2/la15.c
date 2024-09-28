#include<stdio.h>
int main(){
    int age;
    printf("enter age");
    scanf("%d",&age);
    if(age>=18){
        if(age<=50){
            printf("eligible for job");
        }
        else{
            printf("oops sorry, not eligible");
        }
    }
    return 0;
}