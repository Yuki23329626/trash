#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int Node_num = 0;

typedef struct treePtr_   /*binary search tree structure*/
{
    int data;
    struct treePtr_ *parent;
    struct treePtr_ *leftChild;
    struct treePtr_ *rightChild;
} treePtr;

void insert(treePtr *ptr,treePtr *last,int input)
{
    if(!ptr->data)   /*check for null*/
    {
        ptr->data = input;
        ptr->parent = last;  /*last store the address of it's parent*/
        ptr->leftChild = NULL;
        ptr->rightChild = NULL;
        Node_num++;
        return;
    }

    treePtr *tmp;
    if(input < ptr->data)
    {
        if(ptr->leftChild)
            insert(ptr->leftChild,ptr,input);  /*next node*/
        else
        {
            tmp = calloc(1,sizeof(treePtr));
            ptr->leftChild = tmp;
            insert(ptr->leftChild,ptr,input);
        }
    }
    else if(input > ptr->data)
    {
        if(ptr->rightChild)
            insert(ptr->rightChild,ptr,input);  /*next node*/
        else
        {
            tmp = calloc(1,sizeof(treePtr));
            ptr->rightChild = tmp;
            insert(ptr->rightChild,ptr,input);
        }
    }
    else /*input == ptr->data*/
        printf("Number %d has existed!!\n\n",input);//,system("PAUSE");
}

void infix(treePtr *ptr)   /*Print the infix order of BST*/
{
    if(!ptr->data)
    {
        printf("\nNull tree...\n");
        return;
    }
    int top = -1;
    treePtr stack[Node_num];

    treePtr* pop()
    {
        if(top == -1)return NULL;
        return &stack[top--];
    }

    for(;;){
        for(; ptr; ptr = ptr->leftChild)
            stack[++top] = *ptr;  /*Push in stack*/
        ptr = pop();
        if(!ptr)break;
        printf("%d\n",ptr->data);
        ptr = ptr->rightChild;
    }
    return;
}

void lvOrder(treePtr *ptr)   /*Print the level order of the BST*/
{
    if(!ptr->data){
        printf("\nNull tree...\n");
        return;
    }
    int front,rear;
    front = -1,rear = -1;
    treePtr queue[Node_num];

    queue[++rear] = *ptr;
    for(;;){
        ptr = &queue[++front];  /*pop out*/
        if(ptr){
            printf("%d\n",ptr->data);
            if(ptr->leftChild)
                queue[++rear] = *ptr->leftChild;  /*push in*/
            if(ptr->rightChild)
                queue[++rear] = *ptr->rightChild;  /*push in*/
        }
        else break;
        if(front>=rear)break;
    }
    return;
}

treePtr* search(treePtr *node,int key)
{
    while(1)
    {
        if(!node)  /*The node does not exist*/
            return NULL;
        if(key == node->data)  /*The node is found*/
            return node;

        if(key < node->data)
            node = node->leftChild;
        else if(key > node->data)
            node = node->rightChild;
    }
}

treePtr* del(treePtr *node,int key)
{
    if(!node)   /*The node does not exist*/
        return NULL;

    treePtr *tmp,*ptr = search(node,key);
    if(!ptr)return NULL;

    if(ptr->rightChild)   /*If right_child is existed.*/
    {
        node = ptr->rightChild;
        if(node->leftChild)
        {
            while(node->leftChild)
                node = node->leftChild;
            ptr->data = node->data;
            tmp = node->parent;
            tmp->leftChild = node->rightChild;
            if(node->rightChild)
                node->rightChild->parent = tmp;
        }
        else{
            ptr->data = node->data;
            tmp = node->parent;
            if(node->rightChild){
                tmp->rightChild = node->rightChild;
                if(node->rightChild)
                    node->rightChild->parent = tmp;
            }
            else tmp->rightChild = NULL;
        }
        free(node);
    }
    else if(ptr->leftChild)   /*If right_child is not existed but left_child is existed.*/
    {
        node = ptr->leftChild;
        if(node->rightChild)
        {
            while(node->rightChild)
                node = node->rightChild;
            ptr->data = node->data;
            tmp = node->parent;
            tmp->rightChild = node->leftChild;
            if(node->leftChild)
                node->leftChild->parent = tmp;
        }
        else{
            ptr->data = node->data;
            tmp = node->parent;
            if(node->leftChild){
                tmp->leftChild = node->leftChild;
                if(node->leftChild)
                    node->leftChild->parent = tmp;
            }
            else tmp->leftChild = NULL;
        }
        free(node);
    }
    else if(ptr->parent)   /*If the node is a leaf*/
    {
        tmp = ptr->parent;
        if(ptr->data > tmp->data)
            tmp->rightChild = NULL,free(ptr);
        else
            tmp->leftChild = NULL,free(ptr);
    }
    else  /*If the node is root of the whole tree*/
        node->data = 0;
    Node_num--;
    return ptr;
}

void checkbomb(treePtr *node)   /*check for bomb*/
{
    int tmp = node->data;
    while(tmp>7)
    {
        if(tmp%10 == 8)   /*If the number has '8', it has bomb.*/
        {
            if(node->leftChild)
            {
                treePtr *nextleft = node->leftChild;
                del(node->leftChild,nextleft->data);
            }
            else if(node->rightChild)
            {
                treePtr *nextright = node->rightChild;
                del(node->rightChild,nextright->data);
            }
            break;
        }
        tmp/=10;
    }
}

int top,stack[100]={0},path[100],iPath,flag;

treePtr* hunt(treePtr *node,int input)   /*find the key then find the treasure in binary search tree*/
{
    int icount = 0;
    while(top >= 0)   /*If the key has found and the key is not on the beginning*/
    {
        if(input == node->data)  /*Find the node(crossroad) whose left_child and right_child can lead to key and treasure*/
            break;
        else if(input < node->data)
            node = node->leftChild;
        else
            node = node->rightChild;
        if(node->data != stack[++icount])break;
    }

    if(flag == 1)   /*If the key has found*/
    {
        int i;
        for(i=0; i<=top; i++) /*copy the path in stack[] into path[]*/
            path[++iPath] = stack[i];

        if(!node->parent){
            while(stack[top] != node->data && top>=0)
                path[++iPath] = stack[--top],stack[top+1] = 0;
            top = -1;
            return;}

        treePtr *last = node->parent;
        while(stack[top] != last->data && top>=0)   /*Record the path back to the crossroad*/
        {
            if(stack[top] == input){
                top = -1;
                return;
            }
            path[++iPath] = stack[--top],stack[top+1] = 0;
        }
        top = -1;
    }

    while(1)
    {
        if(node)  /*Record the path*/
            stack[++top] = node->data;
        else{
            top = -1;
            return NULL;
        }
        checkbomb(node);  /*check for bomb*/

        if(input == node->data)
            return node;
        if(input < node->data)
            node = node->leftChild;
        else
            node = node->rightChild;
    }
}

int main()
{
    char HWPart[100];
    printf("Please choose:\n1.Binary Search Tree  2.Treasure Hunter (1/2): ");

    while(1){
        fgets(HWPart,100,stdin),HWPart[strlen(HWPart)-1]='\0';
        if(!strcmp(HWPart,"1") || !strcmp(HWPart,"2"))break;
        printf("\nPlease choose:\n1.Binary Search Tree  2.Treasure Hunter (1/2): ");
    }

    if(!strcmp(HWPart,"1"))   /*Part_1: Binary Search Tree*/
    {
        int input;
        treePtr *root = calloc(1,sizeof(treePtr));
        while(1)
        {
            char order[100]= {0};
            printf("\n<<Binary Search Tree>>\n");
            printf("Please choose\n1.Insert(i)\n2.Delete(i)\n3.Search(i)\n4.PrintInfixOrder\n5.PrintLevelOrder\n6.Exit\n(1-6): ");

            scanf(" "),fgets(order,100,stdin),order[strlen(order)-1]='\0';//scanf(" %s",&order);

            if(!strcmp(order,"1"))   /*Insert(i):*/
            {
                printf("\n(key in -1 to finish input):\n");
                while(1){
                    printf("Insert(i): ");
                    scanf("%d",&input);
                    if(input == -1)break;
                    if(input<=0){
                        printf("\nPlease input positive integer...\n\n");
                        continue;
                    }
                    insert(root,NULL,input);
                }
            }
            else if(!strcmp(order,"2"))   /*Delete(i):*/
            {
                printf("\n(key in -1 to finish input):\n");
                while(1){
                    printf("Delete(i): ");
                    scanf("%d",&input);
                    if(input == -1)break;
                    if(input<=0){
                        printf("\nPlease input positive integer...\n\n");
                        continue;
                    }
                    if(del(root,input))
                        printf("Node %d has delete.\n\n",input);
                    else printf("Node %d is not fount...\n\n",input);
                }
            }
            else if(!strcmp(order,"3"))   /*Search(i):*/
            {
                printf("Search(i): ");
                scanf("%d",&input);
                if(!search(root,input))
                    printf("\nNode %d is not found...\n",input);
                else
                    printf("\nNode %d is found.\n",input);
            }
            else if(!strcmp(order,"4"))  /*PrintInfixOrder*/
                infix(root);
            else if(!strcmp(order,"5"))  /*PrintLevelOrder*/
                lvOrder(root);
            else if(!strcmp(order,"6"))  /*Exit*/
                return;
        }
    }
    else{   /*Part_2: Treasure Hunter*/
        while(1)
        {
            FILE *fptr;
            int input,key,treasure,i;
            char filename[100],order[100];
            treePtr *root = calloc(1,sizeof(treePtr));

            printf("\nFile name: ");
            scanf(" ");
            fgets(filename,100,stdin),filename[strlen(filename)-1]='\0';

            if(!(fptr = fopen(filename,"r"))){
                printf("File \"%s\" does not exist...\n",filename);
                continue;
                return;
            }
            else
            {
                printf("\nLoading file \"%s\" successfully.\n\n",filename);
                while(fscanf(fptr,"%d",&input)!=EOF)
                {
                    if(input<=0){
                        printf("Worng data type.\nInput data must be positive integer.\n");
                        continue;
                    }
                    insert(root,NULL,input);
                }
            }

            printf("<<Treasure Hunter>>\n");
            printf("Please set the position of key and treasure:\n");

            flag=0,top=-1,iPath=-1;
            printf("Key: "),scanf("%d",&key);

            if(hunt(root,key))
                flag = 1;
            else{
                printf("Key is not found...\n");
                continue;
            }

            printf("Treasure: "),scanf("%d",&treasure);

            if(!hunt(root,treasure)){
                printf("Treasure is not found...\n");
                continue;
            }
            for(i=0; i<=top; i++)
                path[++iPath] = stack[i],stack[i] = 0;
            for(i=0; i<iPath; i++)
                printf("%d->",path[i]);
            printf("%d\n",path[i]);

            while(1){  /*Exit*/
                printf("Exit? (y/n): ");
                scanf(" ");
                fgets(order,100,stdin),order[strlen(order)-1]='\0';
                if(!strcmp(order,"y"))return;
                else if(!strcmp(order,"n"))break;
            }
            fclose(fptr);
        }
    }
    return;
}
