#include <stdio.h>
#include <math.h>

int arr[1024][1024];

int power(int a,int b)
{
    int tmp = a;
    a = 1;
    while(b--)
    {
        a*=tmp;
    }
    return a;
}

int main()
{
    int i,j,k,size;
    arr[0][0]=1;
    scanf("%d",&size);

    for(i=0;i<size;i++)
    {
        int tmp = pow(2,i);
        for(j=0;j<tmp;j++)
        {
            for(k=0;k<tmp;k++)
            {
                arr[j+tmp][k] = arr[j][k];
                arr[j][k+tmp] = arr[j][k];
                arr[j+tmp][k+tmp] = arr[j][k]*-1;
            }
        }
    }
    for(i=0;i<pow(2,size);i++)
    {
        for(j=0;j<pow(2,size)-1;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("%d\n",arr[i][j]);
    }

    return 0;
}
