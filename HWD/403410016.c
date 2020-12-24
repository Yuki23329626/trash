#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct contact_
{
    int order;
    char Id[11];
    char FirstName[10];
    char LastName[10];
    char Gender[2];
    char Age[3];
    char PhoneNumber[15];
} contact;
int icount,dataSize;
struct contact_ *data;

int choose,sign;  /* choose: the kind of element you want to sort *//* sign: sort by ASC(sign = 1) or DESC(sign = -1) */
int compare(const void *a,const void *b)
{
    struct contact_ *aa = (contact*)a;
    struct contact_ *bb = (contact*)b;
    switch(choose) /* compare by structure's elements. If they have same priority, then compare with order */
    {
    case 1: /* id */
        if(atoi(aa->Id)!=atoi(bb->Id))
            return (atoi(aa->Id)-atoi(bb->Id))*sign;
        else return (aa->order - bb->order);
    case 2: /* FirstName */
        if(strcmp(aa->FirstName,bb->FirstName)!=0)
            return strcmp(aa->FirstName,bb->FirstName)*sign;
        else return (aa->order - bb->order);
    case 3: /* LastName */
        if(strcmp(aa->LastName,bb->LastName)!=0)
            return strcmp(aa->LastName,bb->LastName)*sign;
        else return (aa->order - bb->order);
    case 4: /* Gender */
        if(strcmp(aa->Gender,bb->Gender)!=0)
            return strcmp(aa->Gender,bb->Gender)*sign;
        else return (aa->order - bb->order);
    case 5: /* Age */
        if(atoi(aa->Age)!=atoi(bb->Age))
            return (atoi(aa->Age)-atoi(bb->Age))*sign;
        else return (aa->order - bb->order);
    case 6: /* PhoneNumber */
        if(atoi(aa->PhoneNumber)!=atoi(bb->PhoneNumber))
            return (atoi(aa->PhoneNumber)-atoi(bb->PhoneNumber))*sign;
        else return (aa->order - bb->order);
    }
}

void swap(void *A,void *B,int size_type) /* exchange the things in the memory address */
{
    void *tmp;
    tmp = malloc(size_type);
    memcpy(tmp,A,size_type);
    memcpy(A,B,size_type);
    memcpy(B,tmp,size_type);
    free(tmp);
}

void insert(contact tmp, contact *var, int j, int (*compare_function)(const void*,const void*))
{
    while( compare_function(&var[j],&tmp)>0 && j>=0 )  /* if var[j] > tmp */
    {
        var[j+1] = var[j];
        j--;
    }
    var[j+1] = tmp;
}

void insertion_sort(contact *var, int ncase, int (*compare_function)(const void*,const void*))
{
    int i,j;
    for(i = 1; i < ncase; i++)
    {
        contact tmp = var[i];
        insert(tmp,var,i-1,compare_function);
    }
}

int partition(void *var,int left,int right,int pivotIndex,int size_type,int (*compare_function)(const void*,const void*))
{
    //int pivotValue=var[pivotIndex];
    swap(var+pivotIndex*size_type,var+right*size_type,size_type);/* change the index of the pivot and rightest point */
    int i,storeIndex = left; /* which will point to the final index of pivot */
    for(i=left; i<right; i++)
    {
        if(compare_function(var+i*size_type,var+right*size_type)<0)/* compare the priority and swap */
        {
            swap(var+storeIndex*size_type,var+i*size_type,size_type);
            storeIndex++;
        }
    }
    swap(var+right*size_type,var+storeIndex*size_type,size_type);/* swap pivot to the index of the storeIndex */
    return storeIndex;
}

/* the recursive function of quick sort */
void subqsort(void *var,int left,int right,int size_type,int (*compare_function)(const void*,const void*))
{
    if(right>left)/* work when the array size is bigger than 1 */
    {
        srand(time(NULL));
        int pivotIndex=rand()%(right-left)+left; /* select a random pivot value var[pivotIndex] */
        // printf("pivotIndex=%d\n",pivotIndex);

        int pivotNewIndex = partition(var, left, right, pivotIndex,size_type,compare_function);/* find the new index of the pivot */

        subqsort(var,left, pivotNewIndex-1,size_type,compare_function);/* divided into two portions */
        subqsort(var,pivotNewIndex+1,right,size_type,compare_function);
    }
}

/* quick sort write by myself */
void qqsort(void *var,int ncase,int size_type,int (*compare_function)(const void*,const void*))
{
    subqsort(var,0,ncase-1,size_type,compare_function);
}

/* print the result */
void print(contact data[], int select[])
{
    if(select[0])
        printf("%s\t%s\t%s\t%s\t%s\t%s\t\n","id","FirstName",
               "LastName","Gender","Age","PhoneNum");
    else
    {
        if(select[1])
            printf("%s\t","id");
        if(select[2])
            printf("%s\t","FirstName");
        if(select[3])
            printf("%s\t","LastName");
        if(select[4])
            printf("%s\t","Gender");
        if(select[5])
            printf("%s\t","Age");
        if(select[6])
            printf("%s\t","PhoneNum");
        printf("\n");
    }
    int i;
    for(i=0; i<icount; i++)
    {
        if(select[0])
            printf("%s\t%s\t%s\t%s\t%s\t%s\t\n",data[i].Id,data[i].FirstName,
                   data[i].LastName,data[i].Gender,data[i].Age,data[i].PhoneNumber);
        else
        {
            if(select[1])
                printf("%s\t",data[i].Id);
            if(select[2])
                printf("%s\t",data[i].FirstName);
            if(select[3])
                printf("%s\t",data[i].LastName);
            if(select[4])
                printf("%s\t",data[i].Gender);
            if(select[5])
                printf("%s\t",data[i].Age);
            if(select[6])
                printf("%s\t",data[i].PhoneNumber);
            printf("\n");
        }
    }
}

int instruction_cmp(char *inPtr,const char *cmp)
{
    int i;
    for(i=0; inPtr[i]!='\0'; i++)
        inPtr[i] = toupper(inPtr[i]);
    if(strcmp(inPtr,cmp))
    {
        printf("You have an error in your SQL syntax.\n");
        return 1;
    }
    return 0;
}

int read_file(FILE *fptr,char *inPtr)
{
    if((fptr = fopen(inPtr,"r")) == NULL)
    {
        printf("This file does not exist!\n");
        return 1;
    }
    else
    {
        char str[100];
        while(fgets(str,100,fptr) != NULL)
        {
            if(icount>=dataSize)
                data = realloc(data,(dataSize*=2)*sizeof(contact));
            int i;
            for(i=0; i<strlen(str); i++)  /* substitute ',','"' and '\n' into ' ' */
                if(str[i]==',' || str[i]=='"' || str[i]=='\n')
                    str[i] = ' ';

            sscanf(str,"%s %s %s %s %s %s",&data[icount].Id,&data[icount].FirstName,
                   &data[icount].LastName,&data[icount].Gender,&data[icount].Age,&data[icount].PhoneNumber);
            data[icount].order = icount++;
        }
    }
    return 0;
}

int main()
{
    while(1)
    {
        int i;
        dataSize = 32;
        FILE *fptr;
        data = malloc(dataSize*sizeof(contact));

        char input[1000];
        fgets(input,1000,stdin);

        char *inPtr = strtok(input," ");
        if(!strcmp(input,"quit\n"))break; /* exit the program */
        if(instruction_cmp(inPtr,"SELECT"))continue;

        /* use select[] to record the columns you want to print */
        /* use flag to judge the SQL and error out while the input format is incomplete */
        int select[7]= {0},flag = 0;
        while(1) /* select the Columns */
        {
            inPtr = strtok(NULL," ");

            if(inPtr[strlen(inPtr)-1]!=',')
            {
                if(!strcmp(inPtr,"*"))
                    if(!select[0]) select[0]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"id"))
                    if(!select[1]) select[1]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"FirstName"))
                    if(!select[2]) select[2]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"LastName"))
                    if(!select[3]) select[3]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"Gender"))
                    if(!select[4]) select[4]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"Age"))
                    if(!select[5]) select[5]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"PhoneNum"))
                    if(!select[6]) select[6]++;
                    else flag = 1;
                else flag = 1;
                break;
            }
            else  /* if there has ',' at the end */
            {
                inPtr[strlen(inPtr)-1] = '\0';

                if(!strcmp(inPtr,"id"))
                    if(!select[1]) select[1]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"FirstName"))
                    if(!select[2]) select[2]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"LastName"))
                    if(!select[3]) select[3]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"Gender"))
                    if(!select[4]) select[4]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"Age"))
                    if(!select[5]) select[5]++;
                    else flag = 1;
                else if(!strcmp(inPtr,"PhoneNum"))
                    if(!select[6]) select[6]++;
                    else flag = 1;
                else flag = 1;
                if(flag == 1)break;
            }
        }
        if(flag == 1){
            printf("You have an error in your SQL syntax.\n");
            continue;
        }

        inPtr = strtok(NULL," ");
        if(instruction_cmp(inPtr,"FROM"))continue;

        inPtr = strtok(NULL," ");
        icount = 0;
        if(inPtr[strlen(inPtr)-1] == '\n') /* read from [FileName].csv */
        {
            inPtr[strlen(inPtr)-1] = '\0';
            if(read_file(fptr,inPtr))continue;
            print(data,select);
            continue;
        }
        else{
            if(read_file(fptr,inPtr))continue;
        }

        inPtr = strtok(NULL," ");
        if(instruction_cmp(inPtr,"ORDER"))continue;
        inPtr = strtok(NULL," ");
        if(instruction_cmp(inPtr,"BY"))continue;

        /* stack[][0] record the element you want to sort */
        /* stack[][1] record the [ASC/DESC] */
        /* stack[][2] record the kind of sort you want to use */
        int stack[2][3]= {0},top = -1;
        for(i=0; i<2; i++)
        {
            inPtr = strtok(NULL," ");

            if(!strcmp(inPtr,"id"))
                stack[++top][0] = 1;
            else if(!strcmp(inPtr,"FirstName"))
                stack[++top][0] = 2;
            else if(!strcmp(inPtr,"LastName"))
                stack[++top][0] = 3;
            else if(!strcmp(inPtr,"Gender"))
                stack[++top][0] = 4;
            else if(!strcmp(inPtr,"Age"))
                stack[++top][0] = 5;
            else if(!strcmp(inPtr,"PhoneNum"))
                stack[++top][0] = 6;
            else{
                flag = 1;
                break;
            }

            inPtr = strtok(NULL," ");
            stack[top][1] = 1;
            if(!strcmp(inPtr,"DESC"))
            {
                stack[top][1] = -1;
                inPtr = strtok(NULL," ");
            }
            else if(!strcmp(inPtr,"ASC"))
                inPtr = strtok(NULL," ");
            else flag = 1;

            if(inPtr[strlen(inPtr)-1]=='\n')
            {
                if(!strcmp(inPtr,"-1\n"))
                    flag = 0,stack[top][2] = 1;
                else if(!strcmp(inPtr,"-2\n"))
                    flag = 0,stack[top][2] = 2;
                else flag = 1;
                i++;
            }
            else if(inPtr[strlen(inPtr)-1]==',')
            {
                if(!strcmp(inPtr,"-1,"))
                    flag = 0,stack[top][2] = 1;
                else if(!strcmp(inPtr,"-2,"))
                    flag = 0,stack[top][2] = 2;
                else flag = 1;
            }
            if(flag == 1)break;
        }
        if(flag == 1){
            printf("You have an error in your SQL syntax.\n");
            continue;
        }

        while(top+1)
        {
            if(stack[top][2] == 1)  /* quick sort write by myself */
            {
                choose = stack[top][0];
                sign = stack[top][1];
                qqsort(data,icount,sizeof(contact),compare);  /* it is "qqsort()", not "qsort()" */
            }
            else  /* insertion sort */
            {
                choose = stack[top][0];
                sign = stack[top][1];
                insertion_sort(data,icount,compare);
            }
            for(i=0; i<icount; i++)
                data[i].order = i;
            top--;
        }
        print(data,select);
    }
    return 0;
}
