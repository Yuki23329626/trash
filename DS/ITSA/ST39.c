#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
    int ncase;
    scanf("%d ",&ncase);

    while(ncase--)
    {
        char str[10000],cmp[10000];
        fgets(str,10000,stdin);
        str[strlen(str)-1] = '\0';
        int i,len = strlen(str);
        str[len]='\0';
        for(i=0;i<len;i++)
            str[i] = toupper(str[i]);
        for(i=0;i<len;i++)
            cmp[i] = str[len-i-1];
        cmp[len]='\0';
        if(!strcmp(cmp,str))
            printf("T\n");
        else
            printf("F\n");
    }

    return 0;
}
