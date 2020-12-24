#include <stdio.h>
#include <stdlib.h>

//Find the coefficients of the resulting polynomial. (ax^2 + bx +c)^d
int main()
{
    int a[4],i,j;
    scanf("%d %d %d %d",&a[0],&a[1],&a[2],&a[3]);  //input consists of four integers

    int sol[21],deg=2;
    sol[0]=a[0],sol[1]=a[1],sol[2]=a[2];

    a[3]--;
    while(a[3]--)
    {
        int tmp[21]= {0};
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=deg; j++)
            {
                tmp[i+j] += a[i]*sol[j];
            }
        }
        deg+=2;
        for(int k=0; k<=deg; k++)
            sol[k] = tmp[k];
    }

    for(i=0; i<deg; i++)
        printf("%d ",sol[i]);
    printf("%d\n",sol[i]);

    return 0;
}
