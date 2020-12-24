#include <stdio.h>
#include <stdlib.h>

/* [MM61]CRC */
int main()
{
    int total,legs,tails;
    scanf("%d %d %d",&total,&legs,&tails);

    int chickens,rabbits,crabs;

    crabs = total - tails;
    if(crabs < 0){
        printf("No solution\n");
        return 0;
    }
    legs -= 8*crabs,total-=crabs;
    if(legs < 0||legs%2==1||total<0){
        printf("No solution\n");
        return 0;
    }
    rabbits = legs - total*2;
    if(rabbits%2==1||rabbits<0){
        printf("No solution\n");
        return 0;
    }
    rabbits/=2;
    chickens = total - rabbits;
    if(chickens<0){
        printf("No solution\n");
        return 0;
    }
    printf("%d %d %d\n",chickens,rabbits,crabs);

    return 0;
}
