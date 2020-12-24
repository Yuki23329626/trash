#include <stdio.h>
#include <string.h>

int main()
{

    char str[100];

    while(gets(str)!=NULL)
    {

        int i,mul=1,sum=0;
        for(i=strlen(str)-1; i>=0; i--)
        {
            sum += (str[i]-'A'+1)*mul;
            mul*=26;
        }
        printf("%d\n",sum);
    }

    return 0;
}
