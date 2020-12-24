#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STACK_SIZE 100

typedef struct{
    short int floor;
    short int row;
    short int col;
    short int dir;
} element;

typedef struct{
    short int stair;
    short int vert;
    short int hori;
} offsets;

FILE *fptr;
int flag=0;
char maze[2][MAX_STACK_SIZE+5][MAX_STACK_SIZE+5]= {0};
int table_A[2][MAX_STACK_SIZE][MAX_STACK_SIZE]= {0},table_B[2][MAX_STACK_SIZE][MAX_STACK_SIZE]= {0};

           //RAT_A{Up stairs > Right > Down > Up > Left};
offsets next_A[5]= {{1,0,0},{0,0,1},{0,1,0},{0,-1,0},{0,0,-1}};
           //RAT_B{Down stairs > Left > Up > Down > Right};
offsets next_B[5]= {{-1,0,0},{0,0,-1},{0,-1,0},{0,1,0},{0,0,1}};

element path_A[MAX_STACK_SIZE*MAX_STACK_SIZE+5]= {0},path_B[MAX_STACK_SIZE*MAX_STACK_SIZE+5]= {0};
element *pos_A=&path_A[0],*pos_B=&path_B[0];

void input_MAZE(){  //input the maze

    int tmp,i,j;
    for(i=0; i<2; i++){
        fscanf(fptr,"%d\n",&tmp);
        for(j=0; j<=MAX_STACK_SIZE; j++){
            fgets(maze[i][j],MAX_STACK_SIZE+5,fptr);
            maze[i][j][strlen(maze[i][j])-1] = '\0';
        }
    }
}

void print_MAZE(){  //print the maze
	int i,j;
    for(i=0; i<2; i++)
        for(j=0; j<=MAX_STACK_SIZE; j++)
            /*puts(maze[i][j]),*/fprintf(fptr,"%s\n",maze[i][j]);
}

void RESET(){  //reset rats status
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

void move_A(){  //move RAT_A
	int i;
    for(i=pos_A->dir; i<5; i++){
        pos_A->dir = i;

        int nextfloor = pos_A->floor + next_A[i].stair;
        int nextrow = pos_A->row + next_A[i].vert;
        int nextcol = pos_A->col + next_A[i].hori;

        if((nextfloor<0||nextfloor>1)||table_A[nextfloor][nextrow][nextcol]!=0)
            continue;

        if(i==0){
            if(maze[pos_A->floor][pos_A->row][pos_A->col]=='o'){
                if(maze[nextfloor][nextrow][nextcol]=='X')
                    continue;
                pos_A->floor = nextfloor;
                pos_A->row = nextrow;
                pos_A->col = nextcol;
                pos_A->dir = 0;
                table_A[nextfloor][nextrow][nextcol] = 1;  //mark the way that ratA pass
            }
            continue;
        }

        if(maze[nextfloor][nextrow][nextcol]=='X')
            continue;
        else{
            pos_A->dir++;
            *pos_A++;
            pos_A->floor = nextfloor;
            pos_A->row = nextrow;
            pos_A->col = nextcol;
            pos_A->dir = 0;
            table_A[nextfloor][nextrow][nextcol] = 1;  //mark the way that ratA pass
            return;
        }
    }
    //If there is no way out, back to last step and reset the table_A
    table_A[pos_A->floor][pos_A->row][pos_A->col] = 0;
    *pos_A--;
    return;
}

void move_B(){  //move RAT_B
	int i;
    for(i=pos_B->dir; i<5; i++){
        pos_B->dir = i;

        int nextfloor = pos_B->floor + next_B[i].stair;
        int nextrow = pos_B->row + next_B[i].vert;
        int nextcol = pos_B->col + next_B[i].hori;

        if((nextfloor<0||nextfloor>1) || table_B[nextfloor][nextrow][nextcol]!=0)
            continue;

        if(i==0){
            if(maze[pos_B->floor][pos_B->row][pos_B->col]=='o'){
                if(maze[nextfloor][nextrow][nextcol]=='X')
                    continue;
                pos_B->floor = nextfloor;
                pos_B->row = nextrow;
                pos_B->col = nextcol;
                pos_B->dir = 0;
                table_B[nextfloor][nextrow][nextcol] = 1;  //mark the way that ratB pass
            }
            continue;
        }

        if(maze[nextfloor][nextrow][nextcol]=='X')
            continue;
        else{
            pos_B->dir++;
            *pos_B++;
            pos_B->floor = nextfloor;
            pos_B->row = nextrow;
            pos_B->col = nextcol;
            pos_B->dir = 0;
            table_B[nextfloor][nextrow][nextcol] = 1;  //mark the way that ratB pass
            return;
        }
    }
    //If there is no way out, back to last step and reset the table_B
    table_B[pos_B->floor][pos_B->row][pos_B->col] = 0;
    *pos_B--;
    return;
}

//Rats will stop in these three cases
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
	//system("mazeg.out");
    if((fptr=fopen("maze.txt","r"))==NULL){
        printf("maze.txt doesn't exist...\n");exit(1);}

    flag=0;
    input_MAZE();
    fclose(fptr);

    fptr=fopen("result.txt","w+");
    print_MAZE();

    RESET();  //initialize rats' status

    while(1){

        move_A();
        check();
        if(flag!=0) break;
        //printf("ratA(%d,%d,%d)\n",pos_A->floor,pos_A->row,pos_A->col);
        fprintf(fptr,"ratA(%d,%d,%d)\n",pos_A->floor,pos_A->row,pos_A->col);

        move_B();
        check();
        if(flag!=0) break;
        //printf("ratB(%d,%d,%d)\n",pos_B->floor,pos_B->row,pos_B->col);
        fprintf(fptr,"ratB(%d,%d,%d)\n",pos_B->floor,pos_B->row,pos_B->col);
    }

    switch(flag){
    case 1:
        //printf("rats encounter each other in (%d,%d,%d)\n",pos_A->floor,pos_A->row,pos_A->col);
        fprintf(fptr,"rats encounter each other in (%d,%d,%d)\n",pos_A->floor,pos_A->row,pos_A->col);
        break;
    case 2:
        //printf("rats didn't encounter each other in this maze\n");
        fprintf(fptr,"rats didn't encounter each other in this maze\n");
        break;
    case 3:
        //printf("rats didn't encounter each other in this maze\n");
        fprintf(fptr,"rats didn't encounter each other in this maze\n");
        break;
    }
    fclose(fptr);
    return 0;
}

