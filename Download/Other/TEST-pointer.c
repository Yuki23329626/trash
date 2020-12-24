#include <stdio.h>
#include <stdlib.h>

typedef struct arr_
{
    int a;
    int b;
}arr;

int main()
{
    arr TEST[5]={{1,2},{3,4},{5,6},{7,8},{9,10}};
    arr *ptr = TEST;
    *ptr++;
    ptr->b+=1;

    printf("ptr = %d\n",ptr->b);

    return 0;
}
