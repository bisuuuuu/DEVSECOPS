#include<stdio.h>
int main(){
    int a,b;
    printf("enter two integers");
    scanf("%d%d",&a,&b);
    if(a>b){
        printf("a is greater than b");
    }
    else if(b>a){
        printf("b is greater than a");
    }
    else if(a==b){
        printf("a equals to b");
    }
    else{
        printf("error");
    }
    
     return 0;
    
   
}
