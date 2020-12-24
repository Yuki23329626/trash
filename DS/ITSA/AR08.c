#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i,j,k;
    char str[400],arr[100],tmp[20];
    fgets(str,400,stdin);
    for(i=0,j=0,k=0;i<strlen(str);i++){

        if(str[i]==' '||str[i]=='\n'){
            arr[j++] = atoi(tmp);
            memset(tmp,0,20*sizeof(char));
            k=0;
            continue;
        }
        tmp[k++] = str[i];
        tmp[k] = '\0';
    }

    int max=0,sum=0;
    for(i=0; i<j; i++)
    {
        sum+=arr[i];
        if(sum<0)sum=0;
        if(sum>max)max=sum;
    }
    printf("%d\n",max);

    return 0;
}
