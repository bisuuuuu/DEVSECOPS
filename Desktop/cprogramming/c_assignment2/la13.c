#include<stdio.h>
int main(){
int p,c,m,b,co,totalmark;

printf("enter marks of diffn subjects");
scanf("%d%d%d%d%d",&p,&c,&m,&b,&co);
totalmark=p+c+m+b+co;
float percentage=(float)totalmark/500*100;
printf("the percentage is %f\n",percentage);
if(percentage>='90%'){
    printf("gradeA");
}
else if(percentage>=80){
    printf("gradeB");
}
else if(percentage>=70){
    printf("gradeC");
}
else if(percentage>=60){
    printf("gradeD");
}
else if(percentage>=50){
    printf("gradeE");
}
else{
    printf("gradeF");
}
return 0;
}