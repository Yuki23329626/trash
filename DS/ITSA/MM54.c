#include <stdio.h>
#include <math.h>

/* MM52 Fibonacci number */
int main()
{
    int n;
    scanf("%d",&n);

    int i,tmp,arr[2]={0,1};
    for(i=0.;i<n;i++)
    {
        tmp = arr[1];
        arr[1] = arr[0] + arr[1];
        arr[0] = tmp;
    }

    printf("%d\n",arr[1]);

    return 0;
}
