#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bowl_A,bowl_B,limit;
    while(scanf("%d %d %d",&bowl_A,&bowl_B,&limit)!=EOF)
    {
        int i;
        for(i=limit; i>0; i--)
        {
            if(bowl_A%i==0&&bowl_B%i==0)
                break;
        }
        printf("%d\n",i);
    }
    return 0;
}
