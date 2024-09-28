#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter three numbers");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b){
        if(a>c){
            printf("a is greatest");
        }
        else{
            printf("c is %d\n",c);
        }
    }
 
else{
    if(b>c){
        printf("b is the largest");
    }
    else{
        printf("c is the largest %d\n",c);
    }
}
return 0;
}