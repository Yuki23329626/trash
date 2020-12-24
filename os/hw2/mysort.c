#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <pthread.h>

pthread_mutex_t mtx = PTHREAD_MUTEX_INITIALIZER;

struct Paramaters
{
    int *start;
    int length;
    int depth;
};

// compare function of quick sort
int compare(const void *a, const void *b);
void merge(int *start, int *mid, int *end);
void* merge_sort_subthread(void *ptr);
// multi thread of merge sort
void merge_sort_mthrd(int *start, int length, int depth);
void merge_sort(int *array, int nElements);

int main(int argc, char* argv[])
{
    const int seed = atoi(argv[1]), NUM_OF_INPUT = atoi(argv[2]);
    int i;
    int *data = malloc(NUM_OF_INPUT*sizeof(*data));

    srand(seed);

    for(i=0 ;i<NUM_OF_INPUT; i++)
    {
        data[i] = rand()%NUM_OF_INPUT;
        /*printf("%5d", data[i]);
        if(i%8 == 0)
            printf("\n");*/
    }
    printf("\n\n");

    //qsort(data, NUM_OF_INPUT, sizeof(int), compare);
    merge_sort(data, NUM_OF_INPUT);

    for(i=0 ;i<NUM_OF_INPUT; i++)
    {
        printf("%5d", data[i]);
        if(i%10 == 9)
            printf("\n");
    }
    printf("\n");

    return 0;
}


int compare(const void *a, const void *b)
{
    return *(int*)a - *(int*)b;
}

void merge(int *start, int *mid, int *end)
{
    int *result = malloc((end - start)*sizeof(*result));
    int *leftPart = start, *rightPart = mid, *tmp = result;

    while (leftPart != mid && rightPart != end)
        *tmp++ = (*leftPart <= *rightPart) ? *leftPart++ : *rightPart++;

    while (leftPart != mid)
        *tmp++ = *leftPart++;

    while (rightPart != end)
        *tmp++ = *rightPart++;

    // copy results
    memcpy(start, result, (end - start)*sizeof(*result));
    free(result);
}

void* merge_sort_subthread(void *ptr)
{
    struct Paramaters *paramPtr = ptr;
    merge_sort_mthrd(paramPtr->start, paramPtr->length, paramPtr->depth);
    return ptr;
}

void merge_sort_mthrd(int *start, int length, int depth)
{
    if(length < 2) return;

    if(depth==0 || length < 4)
    {
        merge_sort_mthrd(start, length/2, 0);
        merge_sort_mthrd(start+length/2, length-length/2, 0);
        //qsort(start, length, sizeof(int), compare)
    }
    else
    {
        pthread_t thrdID;
        struct Paramaters params = {start, length/2, depth/2};

        pthread_mutex_lock(&mtx);
        printf("creating thread...\n");
        pthread_mutex_unlock(&mtx);

        //merge_sort_mthrd(start, length/2, depth/2);
        pthread_create(&thrdID, NULL, merge_sort_subthread, &params);
        merge_sort_mthrd(start+length/2, length-length/2, depth/2);

        // join on the launched thread
        pthread_join(thrdID, NULL);

        pthread_mutex_lock(&mtx);
        printf("finished thread.\n");
        pthread_mutex_unlock(&mtx);
    }

    //merge the partitions
    merge(start, start+length/2, start+length);
}

void merge_sort(int *array, int nElements)
{
    merge_sort_mthrd(array, nElements, 4);  // depth = 4 : will create 7 threads.
}
