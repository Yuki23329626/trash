#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[100],count = 0;
    while(scanf("%d",&arr[count++])!=EOF)
        if(arr[count-1]<0)break;

    int i,max=0;
    for(i=0;i<count;i++)
    {
        if(arr[i]>max)
            max=arr[i];
    }
    printf("%d\n",max);

    return 0;
}
