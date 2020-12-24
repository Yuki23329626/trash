#include <stdio.h>

int main()
{
    int i,ncase,n,sum;
    scanf("%d",&ncase);
    while(ncase--){

        scanf("%d",&n);
        sum = 1;
        for(i=1;i<=n;i++)
            sum*=i;
        printf("%d\n",sum);

    }
    return 0;
}
