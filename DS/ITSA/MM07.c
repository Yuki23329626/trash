#include<stdio.h>
#include<stdlib.h>

int main()
{
    int M, N, counter;
    while(scanf("%d %d", &N, &M)!=EOF)
    {
        counter = 0;
        while(M > 0)
        {
            if(M % 100 == N)
                counter++;
            M /= 10;
        }
        printf("%d\n", counter);
    }
    return;
}
