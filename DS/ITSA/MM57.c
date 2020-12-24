#include <stdio.h>

/* [[MM57] Simplified 4 Rods Towers Of Hanoi */
int main()
{
    int n;
    scanf("%d",&n);

    long long int arr[n+1];
    arr[1]=1,arr[2]=3,arr[3]=5,arr[4]=9;

    int i;
    for(i=4;i<=n;i++)
    {
        arr[i] = 2*arr[i-2]+3;
    }
    printf("%lld\n",arr[n]);

    return 0;
}
