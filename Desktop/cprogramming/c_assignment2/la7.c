#include<stdio.h>
int main() {
    char c;
    printf("Enter a character: ");
    scanf("%c", &c);
 int a=(int)c;
    if ((a >=97 && a<= 123) || (a>= 65 && a<= 90))
        printf("%c is an alphabet.", c);
    else
        printf("%c is not an alphabet.", c);

    return 0;
}