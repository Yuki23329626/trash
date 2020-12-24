#include <stdio.h>
#include <stdlib.h>

int main()
{
    int from,to;
    while(scanf("%d %d",&from,&to)!=EOF)
    {
        int i,sum = 0;
        for(i=from; i<=to; i++)
        {
            if(i%2==1)
                sum+=i;
        }
        printf("%d\n",sum);
    }
    return 0;
}
