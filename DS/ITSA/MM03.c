#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ncase;
    scanf("%d",&ncase);
    while(ncase--){

        int alice,dalice,bob,dbob;
        scanf("%d %d %d %d",&alice,&dalice,&bob,&dbob);
        alice %= dalice, bob %= dbob;

        int valice[5000]={0},a_count=-1,vbob[5000]={0},b_count=-1;

        while(1){
            if(valice[alice]==2)break;
            alice*=10;
            alice%=dalice;
            if(alice == 0){
                a_count = 0;
                break;
            }
            valice[alice]++;
            a_count++;
        }
        //printf("Alice = %d\n",a_count);

        while(1){
            if(vbob[bob]==2)break;
            bob*=10;
            bob%=dbob;
            if(bob == 0){
                b_count = 0;
                break;
            }
            vbob[bob]++;
            b_count++;
        }
        //printf("bob = %d\n",b_count);

        if(a_count>b_count)
            printf("A\n");
        else if(a_count<b_count)
            printf("B\n");
        else printf("T\n");

    }
    return 0;
}
