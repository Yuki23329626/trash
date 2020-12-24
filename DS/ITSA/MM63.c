#include <stdio.h>
#include <math.h>

int main()
{
    int input;
    scanf("%d",&input);

    int i,arr[100000][2]= {{0}},top=0;

    arr[top][0] = 1;
    if(input%2==0)
        arr[top][0] = 2;
    while(input%2==0)
    {
        input/=2;
        arr[top][1]++;
    }
    if(arr[top][1]>0)
        top++;

    for(i=3; input!=1; i++)
    {
        arr[top][0] = i;
        while(input%i==0)
        {
            input/=i;
            arr[top][1]++;
        }
        if(arr[top][1]>0)
            top++;
    }

    for(i=0; arr[i][0]!=0; i++)
    {
        if(i>0)printf(" x ");
        printf("%d",arr[i][0]);
        if(arr[i][1]>1)
            printf("^%d",arr[i][1]);
        else
            printf("^1");
    }
    printf("\n");

    return 0;
}
