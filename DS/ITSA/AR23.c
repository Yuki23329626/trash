#include <stdio.h>
#include <string.h>

int main(){

    char str[1000];

    gets(str);

    int i;
    for(i=0;i<strlen(str);i++){
        if('A'<=str[i] && str[i]<='Z')
            str[i] = (str[i]-'A'+'N'-'A')%('Z'-'A'+1)+'A';
        else if('a'<=str[i] && str[i]<='z')
            str[i] = (str[i]-'a'+'n'-'a')%('z'-'a'+1)+'a';
    }

    puts(str);

    return 0;
}
