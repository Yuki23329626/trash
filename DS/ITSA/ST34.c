#include <stdio.h>
#include <string.h>

char str[1000000],ANS[1000000];

int main()
{
    char str[1000];
    scanf("%s",str);
    int i,arr[27]={0};

    for(i=0;i<strlen(str);i++)
    {
        if('A'<=str[i]&&str[i]<='Z')
            arr[str[i]-'A']++;
        else if('a'<=str[i]&&str[i]<='z')
            arr[str[i]-'a']++;
    }
    for(i=0;i<26;i++)
        printf("%d\n",arr[i]);

    return 0;
}
