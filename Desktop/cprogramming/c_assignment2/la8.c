#include<stdio.h>
int main(){
    char c;
    printf("enter any char");
    scanf("%c",&c);
    if(c=='a'||c=='e'||c=='i'||c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'){
    printf("its a vowel %c\n",c);
    }
    else{
        printf("its a consonant %c\n",c);
    }
     return 0;
    
   
}
