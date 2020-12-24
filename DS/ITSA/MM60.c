#include <stdio.h>
#include <stdlib.h>

float input,arr[10000000]={0};

int compare(const void *a,const void *b)
{
    float aa = *(float*)a;
    float bb = *(float*)b;
    return aa-bb;
}

/* [MM60] Find The Median */
int main()
{
    int count = -1;
    while(scanf("%f",&input)!=EOF){
        if(input<0)break;
        arr[++count]=input;
    }
    qsort(arr,count+1,sizeof(float),compare);

    if(count%2==0)
        printf("Median=%.0f\n",arr[count/2]);
    else
        printf("Median=%.1f\n",(arr[count/2]+arr[count/2+1])/2);

    return 0;
}
