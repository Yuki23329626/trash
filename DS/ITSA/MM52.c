#include <stdio.h>
#include <math.h>

int main()
{
    int i,j,input,sum;
    scanf("%d",&input);

    for(i=6; i<=input; i+=2)
    {
        for(j=2,sum=0; j<sqrt(i); j++)
        {
            if(i%j==0)
                sum+=(j+i/j);
        }
        sum++;

        if(sum == i)
            printf("%d\n",sum);
    }
    return 0;
}
