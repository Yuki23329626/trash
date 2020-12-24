#include <stdio.h>

int main()
{
    int input,sum=0,front,rear,flag;

    while(scanf("%d",&input)!=EOF){
        if(sum>0)printf("\n");
        sum = 1;
        front = 1,rear = 0,flag = 0;
        while(1){//printf("rear = %d, front = %d\n",rear,front);
            if(front>=input){
                if(flag==0)
                    printf("0 0\n");
                break;
            }
            if(sum>input)
                sum-=rear,rear++;
            else if(sum==input){
                flag = 1;
                if(input==1)printf("0 0\n");
                if(front == input)break;
                if(rear==0)rear++;
                printf("%d %d\n",rear,front);
                if(rear==0)rear++,printf("%d %d\n",rear,front);
                front++,sum+=front;
            }
            else
                front++,sum+=front;
        }
    }

    return 0;
}
