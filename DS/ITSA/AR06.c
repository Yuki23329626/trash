#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int row;
    int col;
    int val;
}note;

int compare(const void *a,const void *b)
{
    note *aa = (note*)a;
    note *bb = (note*)b;
    return bb->val - aa->val;
}

int main()
{
    int i,j,k=0;
    int nsize;
    scanf("%d",&nsize);

    int matric[nsize][nsize];
    note arr[nsize*nsize+1];

    for(i=0; i<nsize; i++)
        for(j=0; j<nsize; j++)
            scanf("%d",&matric[i][j]),arr[k].row=i+1,arr[k].col=j+1,arr[k].val=matric[i][j],k++;

    qsort(arr,nsize*nsize,sizeof(note),compare);

    note mark[nsize];
    for(i=0;i<nsize;i++)mark[i].row=0,mark[i].col=0,mark[i].val=0;
    k=0;
    for(i=0;i<nsize*nsize;i++)
    {
        int flag=0;
        for(j=0;mark[j].row!=0;j++)
        {
            if(arr[i].row==mark[j].row || arr[i].col==mark[j].col)
                {flag=1;break;}
        }
        if(flag==0)
            mark[k].row=arr[i].row,mark[k].col=arr[i].col,mark[k].val=arr[i].val,k++;
    }
    for(i=0;i<nsize;i++)
        printf("boy %d pair with girl %d\n",mark[i].row,mark[i].col);

    return 0;
}
