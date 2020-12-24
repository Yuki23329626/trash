#include <stdio.h>
#include <math.h>

/* [MM56] Cable Car Assignment */
int main()
{
    int i,j,arr[6];
    scanf("%d, %d, %d, %d, %d, %d",&arr[0],&arr[1],&arr[2],&arr[3],&arr[4],&arr[5]);

    int a=0,b=0,complain = 12,max=0;
    for(i=0; i<6; i++)
    {
        for(j=i+1; j<6; j++)
        {
            if(arr[i]+arr[j]>=max&&arr[i]+arr[j]<=6)
            {
                max = arr[i] + arr[j];
                if(j-1<complain||(j-1==complain&&j<b))
                    a=arr[i],b=arr[j],complain = j-1;
            }
        }
    }
    printf("The best combination is %d, %d, Complaint=%d\n",a,b,complain);

    return 0;
}
