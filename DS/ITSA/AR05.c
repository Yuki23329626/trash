#include <stdio.h>
#include <stdlib.h>

int cnt,Div,num,arr[10]= {0};
int note[10];

int compare(const void*,const void*);
void perm(int,char*);

int main()
{
    int i,ncase;
    scanf("%d",&ncase);

    while(ncase--)
    {
        char tmp[10]={0};
        cnt=0;

        for(i=0;; i++)
        {
            scanf("%d",&arr[i]);
            if(arr[i]<0)break;
        }

        num=i;
        scanf("%d",&Div);

        qsort(arr,num,sizeof(int),compare);  //先排序

        perm(0,tmp);
        printf("%d\n",cnt);
    }
    return 0;
}

void perm(int offset,char *tmp)
{
    if(offset>=num) //一個數字的結尾
    {
        int sol=atoi(tmp);
        if(sol%Div==0)cnt++;
        return;
    }
    for(int i=0; i<num; i++)
    {
        if(arr[i]==arr[i+1]&&note[i+1]==0)continue; //以note註記，避免重複
        if(note[i]==1)continue;

        tmp[offset]=arr[i]+'0';
        note[i]=1;
        perm(offset+1,tmp); //遞迴呼叫自己，尋找下一位數
        note[i]=0; //歸零
    }
}

int compare(const void *a,const void *b)
{
    int aa=*(int*)a;
    int bb=*(int*)b;
    return aa-bb;
}
