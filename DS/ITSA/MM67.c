#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ncase;
    scanf("%d",&ncase);

    while(ncase--)
    {
        int input,count=0;
        scanf("%d",&input);
        while(input!=1)
        {
            count++;
            if(input%2==0)
                input/=2;
            else
                input = input*3+1;
        }
        if(count==0)count=1;
        printf("%d\n",count);
    }

    return 0;
}
