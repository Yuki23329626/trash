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

        qsort(arr,num,sizeof(int),compare);  //���Ƨ�

        perm(0,tmp);
        printf("%d\n",cnt);
    }
    return 0;
}

void perm(int offset,char *tmp)
{
    if(offset>=num) //�@�ӼƦr������
    {
        int sol=atoi(tmp);
        if(sol%Div==0)cnt++;
        return;
    }
    for(int i=0; i<num; i++)
    {
        if(arr[i]==arr[i+1]&&note[i+1]==0)continue; //�Hnote���O�A�קK����
        if(note[i]==1)continue;

        tmp[offset]=arr[i]+'0';
        note[i]=1;
        perm(offset+1,tmp); //���j�I�s�ۤv�A�M��U�@���
        note[i]=0; //�k�s
    }
}

int compare(const void *a,const void *b)
{
    int aa=*(int*)a;
    int bb=*(int*)b;
    return aa-bb;
}
