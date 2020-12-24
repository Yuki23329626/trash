#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STACK_SIZE 100

typedef struct
{
    short int floor;
    short int row;
    short int col;
    short int dir;
} element;

typedef struct
{
    short int stair;
    short int vert;
    short int hori;
} offsets;

int flag;
char maze[2][MAX_STACK_SIZE+5][MAX_STACK_SIZE+5]= {0};
int table_A[2][MAX_STACK_SIZE][MAX_STACK_SIZE]= {0},table_B[2][MAX_STACK_SIZE][MAX_STACK_SIZE]= {0};

//RAT_A{Up stairs > Right > Down > Up > Left > Down stairs};
offsets next_A[6]= {{1,0,0},{0,0,1},{0,1,0},{0,-1,0},{0,0,-1},{-1,0,0}};
//RAT_B{Down stairs > Left > Up > Down > Right > Up stairs};
offsets next_B[6]= {{-1,0,0},{0,0,-1},{0,-1,0},{0,1,0},{0,0,1},{1,0,0}};

element path_A[MAX_STACK_SIZE*MAX_STACK_SIZE+5]= {0},path_B[MAX_STACK_SIZE*MAX_STACK_SIZE+5]= {0};
element *pos_A=&path_A[0],*pos_B=&path_B[0];

//input maze
void INPUT()
{
    int tmp;
    for(int i=0; i<2; i++)
    {
        scanf("%d\n",&tmp);
        for(int j=0; j<=MAX_STACK_SIZE; j++)
        {
            fgets(maze[i][j],MAX_STACK_SIZE+5,stdin);
            maze[i][j][strlen(maze[i][j])-1] = '\0';
        }
    }
}

//print maze
void print_MAZE()
{
    for(int i=0; i<2; i++)
    {
        printf("%d\n",i+1);
        for(int j=0; j<=MAX_STACK_SIZE; j++)
            puts(maze[i][j]);
    }
}

void RESET()
{
    path_A[0].floor=0;
    path_A[0].row=1;
    path_A[0].col=1;
    path_A[0].dir=0;
    table_A[0][1][1]=1;

    path_B[0].floor=1;
    path_B[0].row=99;
    path_B[0].col=99;
    path_B[0].dir=0;
    table_B[1][99][99]=1;
}

void move_A()
{
    for(int i=pos_A->dir; i<5; i++)
    {
        pos_A->dir = i;
        int nextfloor = pos_A->floor + next_A[i].stair;
        int nextrow = pos_A->row + next_A[i].vert;
        int nextcol = pos_A->col + next_A[i].hori;

        if(nextfloor<0||nextfloor>1)continue;
        if(table_A[nextfloor][nextrow][nextcol]!=0)
        {
            //printf("i=%d.\n",i);
            //system("PAUSE");
            continue;
        }

        if(i==0)
        {
            //printf("i=0,nextfloor = %d, nextrow = %d, nextcol = %d.\n",nextfloor,nextrow,nextcol),system("PAUSE");
            if(maze[pos_A->floor][pos_A->row][pos_A->col]=='o')
            {
                if(maze[nextfloor][nextrow][nextcol]=='X')
                    continue;
                pos_A->dir++;
                *pos_A++;
                pos_A->floor = nextfloor;
                pos_A->row = nextrow;
                pos_A->col = nextcol;
                pos_A->dir = 0;
                table_A[nextfloor][nextrow][nextcol] = 1;
                return;
            }
            continue;
        }

        if(maze[nextfloor][nextrow][nextcol]=='X')
        {
            //printf("next = 'X'.\n");
            continue;
        }
        else
        {
            //printf("next is clear.\n");
            //printf("i=%d,nextfloor = %d, nextrow = %d, nextcol = %d.\n",i,nextfloor,nextrow,nextcol),system("PAUSE");
            pos_A->dir++;
            *pos_A++;
            pos_A->floor = nextfloor;
            pos_A->row = nextrow;
            pos_A->col = nextcol;
            pos_A->dir = 0;
            table_A[nextfloor][nextrow][nextcol] = 1;
            return;
        }
    }

    table_A[pos_A->floor][pos_A->row][pos_A->col] = 0;
    //printf("\nBACK.\n\n");
    *pos_A--;
    return;
}

void move_B()
{
    for(int i=pos_B->dir; i<5; i++)
    {
        pos_B->dir = i;
        int nextfloor = pos_B->floor + next_B[i].stair;
        int nextrow = pos_B->row + next_B[i].vert;
        int nextcol = pos_B->col + next_B[i].hori;

        if(nextfloor<0||nextfloor>1)continue;
        if(table_B[nextfloor][nextrow][nextcol]!=0)
        {
            //printf("i=%d.\n",i);
            //system("PAUSE");
            continue;
        }

        if(i==0)
        {
            //printf("i=0,nextfloor = %d, nextrow = %d, nextcol = %d.\n",nextfloor,nextrow,nextcol),system("PAUSE");
            if(maze[pos_B->floor][pos_B->row][pos_B->col]=='o')
            {
                if(maze[nextfloor][nextrow][nextcol]=='X')
                    continue;
                pos_B->dir++;
                *pos_B++;
                pos_B->floor = nextfloor;
                pos_B->row = nextrow;
                pos_B->col = nextcol;
                pos_B->dir = 0;
                table_B[nextfloor][nextrow][nextcol] = 1;
                return;
            }
            continue;
        }

        if(maze[nextfloor][nextrow][nextcol]=='X')
        {
            //printf("next = 'X'.\n");
            continue;
        }
        else
        {
            //printf("next is clear.\n");
            //printf("i=%d,nextfloor = %d, nextrow = %d, nextcol = %d.\n",i,nextfloor,nextrow,nextcol),system("PAUSE");
            pos_B->dir++;
            *pos_B++;
            pos_B->floor = nextfloor;
            pos_B->row = nextrow;
            pos_B->col = nextcol;
            pos_B->dir = 0;
            table_B[nextfloor][nextrow][nextcol] = 1;
            return;
        }
    }

    table_B[pos_B->floor][pos_B->row][pos_B->col] = 0;
    //printf("\nBACK.\n\n");
    *pos_B--;
    return;
}

void check()
{
    if((pos_A->floor == pos_B->floor) && (pos_A->row == pos_B->row) && (pos_A->col == pos_B->col))
        flag=1;
    else if((pos_A->floor==1) && (pos_A->row==99) && (pos_A->col==99))
        flag=2;
    else if((pos_B->floor==0) && (pos_B->row==1) && (pos_B->col==1))
        flag=3;

    return;
}

int main()
{
    flag=0;
    INPUT();
    //print_MAZE();

    //initialize rats' status
    RESET();

    printf("RAT_A( %d, %d, %d)\n",pos_A->floor,pos_A->row,pos_A->col);
    printf("RAT_B( %d, %d, %d)\n",pos_B->floor,pos_B->row,pos_B->col);

    while(1)
    {
        move_A();
        printf("RAT_A( %d, %d, %d)\n",pos_A->floor,pos_A->row,pos_A->col);
        //system("PAUSE");

        move_B();
        printf("RAT_B( %d, %d, %d)\n",pos_B->floor,pos_B->row,pos_B->col);
        //system("PAUSE");

        check();

        //print_MAZE();
        //system("PAUSE");

        if(flag!=0)
            break;
    }

    switch(flag)
    {
    case 1:
        printf("RAT_A and RAT_B met each other at ( %d, %d, %d).\n",
               pos_A->floor,pos_A->row,pos_A->col);
        break;
    case 2:
        printf("RAT_A and RAT_B didn't meet each other in the maze...\n");
        break;
    case 3:
        printf("RAT_A and RAT_B didn't meet each other in the maze...\n");
        break;
    }

    return 0;
}

