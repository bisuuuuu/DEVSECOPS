#include<stdio.h>
int main() {
   float amount;
    float note500=0,note200=0,note100=0;
    printf("Enter total money ");
    scanf("%f", &amount);
    if(amount>500){
        note500=amount/note500;
        amount=amount%500;
    }
    if(amount>200){
        note200=amount/note200;
        amount=amount%200;
    }
    if(amount>100){
        note100=amount/note100;
        amount=amount%100;
    }
    printf("the amount vALUE OF Note 500 is %f\n",note500);
    printf("the amount vALUE OF Note 200 is %f\n",note200);
    printf("the amount vALUE OF Note 100 is %f\n",note100);
    return 0;
}