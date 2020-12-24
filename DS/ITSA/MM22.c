#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int t;
    while(scanf("%d",&t)!=EOF)
    {
        int a[3000]= {0},b[3000]= {0},i,k=1;
        for(i=1; i<=t; i++)
            scanf("%d",&a[i]);
        for(i=1; i<t; i++)
        {
            if(abs(a[i]-a[i+1])>3000)
            {
                k=0;
                break;
            }
            b[abs(a[i]-a[i+1])]=1;
        }
        for(i=1; i<t; i++)
        {
            if(b[i]==0)
            {
                k=0;
                break;
            }
        }
        if(k==1)
            printf("Jolly\n");
        else
            printf("Not jolly\n");
    }
    return 0;
}
