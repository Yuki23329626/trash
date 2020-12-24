#include <stdio.h>

int main(){

    int n;
    scanf("%d",&n);

    int i,input,arr[70001]={0};
    for(i=0;i<n-1;i++){
        scanf("%d",&input);
        arr[input] = 1;
    }

    for(i=1;i<n+1;i++)
        if(arr[i]==0)printf("%d\n",i);


    return 0;
}
