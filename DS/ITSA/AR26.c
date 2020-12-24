#include <stdio.h>

int main(){

    int rows,cols,stdn[2]={0};
    scanf("%d %d",&rows,&cols);

    int i,j,input;
    for(i=0;i<rows;i++)
    {
        for(j=0;j<cols;j++)
        {
            scanf("%d",&input);
            stdn[input]++;
        }
    }
    if(stdn[0]>stdn[1])
        printf("0\n");
    else if(stdn[1]>stdn[0])
        printf("1\n");
    else
        printf("2\n");

    return 0;
}
