#include <stdio.h>
#include <stdlib.h>

int main(){

    int ncase;
    scanf("%d",&ncase);
    while(ncase--){
        int i,n,input[1000],max=0,min=100000000;
        scanf("%d",&n);
        for(i=0;i<n;i++){
            scanf("%d",&input[i]);
            if(input[i]>max)
                max = input[i];
            if(input[i]<min)
                min = input[i];
        }
        //printf("max=%d, min=%d\n",max,min);

        while(1){
            if(max>min)
                max-=min;
            else if(max<min)
                min-=max;
            else
                break;
        }

        printf("%d\n",max);
    }

    return 0;
}
