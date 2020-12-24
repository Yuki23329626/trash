#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

/*
    Name: ¨H¿@µ¾
    Student ID: 403410016
    Dept.: ¸ê¤u¤G
*/

char* newline(char* str, const char* cmpstr);
// Substitute "<Newline>" into "\n"

char* strtake(char* str, const char* cmpstr);
// Change the string (cmpstr) which is in the string (str) into space;

char* proper(char* str, const char* cmpstr);
// Change the first character of each word between "<Proper>" and "</Proper>" into upper size

char* upper(char* str, const char* cmpstr);
// Change each word between "<Upper>" and "</Upper>" into upper size

char* lower(char* str, const char* cmpstr);
// Change each word between "<Lower>" and "</Lower>" into lower size

char* reverse(char* str, const char* cmpstr);
// Reverse the sentence between "<Reverse>" and "</Reverse>"

int flag;
void typeset(char* str);
// Parameter:
// str: C string to be scanned.
// Return Value: None

int main(int argc, char *argv[])
{
    FILE *fptr1,*fptr2;
    char str[200];

    if(!(fptr1 = fopen(argv[1], "r")))
    {
        printf("File does not exist...\n");
        exit(1);
    }

    fptr2 = fopen("test.output", "w+");
    int ncase = 1;
    while(fgets(str, 200, fptr1) != NULL)
    {
        str[strlen(str)] = '\0';

        flag = 0;
        typeset(str);
        if(flag == 1)
        {
            printf("ERROR In \"%s\" Line %d: "
                   "Pairs of tags are interleaved!\n","test.tex",ncase);
            ncase++;
            continue;
        }

        if(flag == 0)
            fprintf(fptr2,str,"%s");

        ncase++;
    }
    fclose(fptr1);
    fclose(fptr2);

    return 0;
}

void typeset(char *str)
{
    if(flag == 1) return;
    int label = 0;
    char *startptr = &str[strlen(str)],*sptr = str,*find;

    // Find the first label
    if((find = strstr(str,"<Newline>")))startptr = find, label = 1;
    if((find = strstr(str,"<Proper>")) && find < startptr)
        startptr = find, label = 2;
    if((find = strstr(str,"<Upper>")) && find < startptr)
        startptr = find, label = 3;
    if((find = strstr(str,"<Lower>")) && find < startptr)
        startptr = find, label = 4;
    if((find = strstr(str,"<Reverse>")) && find < startptr)
        startptr = find, label = 5;
    if((find = strstr(str,"<Insert")) && find < startptr)
        startptr = find, label = 6;

    if(label == 1)
    {
        sptr = newline(str,"<Newline>");
        strcat(str, &sptr[9]);

        if(strchr(str,'<') != NULL)
            typeset(str);
    }
    else if(label == 2)
    {
        sptr = strtake(str,"<Proper>");
        strcat(str, &sptr[8]);
        typeset(str);
        if((sptr = proper(sptr,"</Proper>")) == NULL)
        {
            flag = 1;
            return;
        }
        strcat(str, &sptr[9]);
    }
    else if(label == 3)
    {
        sptr = strtake(str,"<Upper>");
        strcat(str, &sptr[7]);
        typeset(str);

        if((sptr = upper(sptr,"</Upper>")) == NULL)
        {
            flag = 1;
            return;
        }
        strcat(str, &sptr[8]);
    }
    else if(label == 4)
    {
        sptr = strtake(str,"<Lower>");
        strcat(str, &sptr[7]);
        typeset(str);

        sptr = lower(sptr,"</Lower>");
        strcat(str, &sptr[8]);
    }
    else if(label == 5)
    {
        sptr = strtake(str,"<Reverse>");
        strcat(str, &sptr[9]);
        typeset(str);

        if((sptr = reverse(sptr,"</Reverse>")) == NULL)
        {
            flag = 1;
            return;
        }
        strcat(str, &sptr[10]);
    }
    else if(label == 6)
    {
        startptr = strstr(str,"<Insert");
        char ch[10],num[10],*ptr,tail[100];
        ptr = strstr(startptr,"char");
        ptr = strchr(ptr,'\'');
        unsigned int i;
        for(i = 0 ; ptr[i+1] != '\'' ; i++)
            ch[i] = ptr[i+1];
        ch[i] = '\0';

        ptr = strstr(startptr,"num");
        ptr = strchr(ptr,'\'');
        for(i = 0 ; ptr[i+1] != '\'' ; i++)
            num[i] = ptr[i+1];
        num[i] = '\0';

        for(i = 0 ; i < strlen(ch)*atoi(num) ; i++)
        {
            startptr[i] = ch[i%strlen(ch)];
        }
        ptr = strchr(startptr,'>');
        ptr = &ptr[1];
        strcpy(tail,ptr);
        strcpy(&startptr[i],tail);

        if(strchr(str,'<') != NULL)
            typeset(str);
    }
}

char* newline(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);
    if(tmp == NULL)
        return NULL;
    unsigned int i;
    for(i = 0 ; i < strlen(cmpstr) ; i++)
    {
        tmp[i] = ' ';
    }
    tmp[0] = '\n';
    tmp[1] = '\0';
    return tmp;
}

char* strtake(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);

    if(tmp == NULL)
        return NULL;
    unsigned int i;
    for(i = 0 ; i < strlen(cmpstr) ; i++)
        tmp[i] = ' ';

    tmp[0] = '\0';
    return tmp;
}

char *proper(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);

    if(tmp == NULL)
        return NULL;
    unsigned int i;
    for(i = 0 ; i < strlen(cmpstr) ; i++)
        tmp[i] = ' ';

    sptr[0] = toupper(sptr[0]);
    for(i = 1 ; i < (strlen(sptr) - strlen(tmp)) ; i++)
    {
        if(sptr[i] == '<')
            flag = 1;
        if(flag == 0)
            if(sptr[i-1] == ' ' || sptr[i-1] == '\n')
                sptr[i] = toupper(sptr[i]);
    }
    tmp[0] = '\0';
    return tmp;
}

char *upper(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);

    if(tmp == NULL)
        return NULL;
    unsigned int i;
    for(i = 0 ; i < strlen(cmpstr) ; i++)
        tmp[i] = ' ';

    for(i = 0 ; i < (strlen(sptr) - strlen(tmp)); i++)
    {
        if(sptr[i] == '<')
            flag = 1;
        if(flag == 0)
            sptr[i] = toupper(sptr[i]);
    }
    tmp[0] = '\0';
    return tmp;
}

char *lower(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);

    if(tmp == NULL)
        return NULL;
    unsigned int i;
    for(i = 0 ; i < strlen(cmpstr) ; i++)
        tmp[i] = ' ';
    for(i = 0 ; i < (strlen(sptr) - strlen(tmp)); i++)
    {
        if(sptr[i] == '<')
            flag = 1;
        if(flag == 0)
            sptr[i] = tolower(sptr[i]);
    }
    tmp[0] = '\0';
    return tmp;
}

char *reverse(char *sptr, const char *cmpstr)
{
    char *tmp = strstr(sptr, cmpstr);
    if(tmp == NULL)
        return NULL;

    unsigned int i,length = (strlen(sptr) - strlen(tmp));
    for(i = 0 ; i < strlen(cmpstr) ; i++)
        tmp[i] = ' ';

    char cpy[200];
    strncpy(cpy,sptr,length);
    for(i = 0 ; i < length ; i++)
    {
        if(sptr[i] == '<')
            flag = 1;
        if(flag == 0)
            sptr[i] = cpy[length-i-1];
    }
    tmp[0] = '\0';
    return tmp;
}

