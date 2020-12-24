#include <stdio.h>
#include <string.h>

int main(){

    char CH_NUM[10][4]={"¹s\0","³ü\0","¶L\0","°Ñ\0","¸v\0","¥î\0","³°\0","¬m\0","®Ã\0","¨h\0"};

    int ncase;
    scanf("%d",&ncase);

    while(ncase--){
        short int flag1=0,flag2=0;
        long long int num,tmp;
        scanf("%lld",&num);

        if(num/100000000 > 0){
            tmp = num/100000000;
            printf("%s»õ",CH_NUM[tmp]);
        }
        if((num/10000)%10000 > 0){
            tmp = num/10000;
            tmp%=10000;
            long long int copy = tmp;

            if(tmp/1000 > 0)
                printf("%s¥a",CH_NUM[tmp/1000]),tmp%=1000,flag1 = 1;
            if(tmp/100 > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s¨Õ",CH_NUM[tmp/100]),tmp%=100,flag1 = 1;
            }
            else if(num/10000>tmp)flag2 = 1;
            if(tmp/10 > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s¬B",CH_NUM[tmp/10]),tmp%=10,flag1 = 1;
            }
            else if(num/10000>tmp)flag2 = 1;
            if(tmp > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s",CH_NUM[tmp]),flag1 = 1;
            }
            else if(num/10000>tmp)flag2 = 1;

            if(copy>0)
                flag1=0,flag2=0,printf("¸U");
        }
        if(num%10000 > 0){
            tmp = num%10000;

            if(tmp/1000 > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s¥a",CH_NUM[tmp/1000]),tmp%=1000,flag1 = 1;
            }
            else if(num>tmp)flag2 = 1;
            if(tmp/100 > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s¨Õ",CH_NUM[tmp/100]),tmp%=100,flag1 = 1;
            }
            else if(num>tmp)flag2 = 1;
            if(tmp/10 > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s¬B",CH_NUM[tmp/10]),tmp%=10,flag1 = 1;
            }
            else if(num>tmp)flag2 = 1;
            if(tmp > 0){
                if(flag1 == 1 && flag2 == 1)
                    flag1=0,flag2=0,printf("¹s");
                printf("%s",CH_NUM[tmp]),flag1 = 1;
            }
            else if(num>tmp)flag2 = 1;
        }
        printf("\n");
    }

    return 0;
}
