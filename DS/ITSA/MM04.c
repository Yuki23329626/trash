#include <stdio.h>
#include <math.h>

int main()
{
    long long int ncase,i,input,sum;
    scanf("%lld",&ncase);

    while(ncase--){
    scanf("%lld",&input);

    for(i=2,sum=0;i<sqrt(input);i++){
        if(input%i==0)
            sum+=(i+input/i);
    }
    sum++;

    if(sum == input)
        printf("perfect\n");
    else
        printf("nonperfect\n");
    }
    return 0;
}
