#include <stdio.h>

/* [MM59] Majority Value */
int main()
{
    int arr[10000]={0},input,count = 0;
    while(scanf("%d",&input)!=EOF){
            if(input<0)break;
        arr[input]++,count++;
    }
    int i;
    int tmp = 0,max,flag=0;
    for(i=0;i<10000;i++)
    {
        if(arr[i]>tmp)
        {
            flag = 0;
            tmp = arr[i];
            max = i;
        }
        else if(arr[i]==tmp){
            flag = 1;
        }
    }
    if(flag == 0 && tmp >= count/2)
        printf("Majority is %d\n",max);
    else
        printf("No Majority\n");
    return 0;
}
