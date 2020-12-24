#include <stdio.h>
#define INT_INFINITE 1073741823

int capacity,nstation,goal,npath,nodeBikes[10000],rent = 0,bring = 0,top=-1;
int bring_out = INT_INFINITE,bring_back = INT_INFINITE,min_length = INT_INFINITE;

void best_path(int vertex,int mark[],int path[][nstation],int visited[],int stack[],int *ANS)
{
    int i;
    if(vertex == 0){  /* reach the goal */
        for (i=nstation-1; i>=0; i--)
            if (stack[i]>=0)
            {
                int tmp = nodeBikes[stack[i]]-capacity/2;
                if(tmp>0)
                    bring += tmp;
                else if(tmp<0)
                {
                    tmp *= -1;
                    if(bring>tmp)
                        bring -= tmp;
                    else{
                        tmp -= bring,bring = 0;
                        rent += tmp;
                    }
                }
            }
        if( rent<bring_out || ( rent==bring_out && bring<bring_back ))
        {
            bring_out = rent;
            bring_back = bring;
            for(i=0 ;stack[i]; i++)
                ANS[i] = stack[i];
        }
        bring = rent = 0;
    }
    else{
        visited[vertex] = 1;
        stack[++top] = vertex;
        for(i=1; i<mark[vertex]+1; i++){
            if(!visited[path[vertex][i]])
                best_path(path[vertex][i],mark,path,visited,stack,ANS);
        }
        visited[vertex] = 0;
        stack[top--] = -1;
    }
}

int choose(int shortcut[],int found[])  /* choose the next closest node to YMC */
{
    int i,min,minpos;
    min = INT_INFINITE;
    minpos = -1;

    for(i=0; i<nstation; i++)
        if(shortcut[i] < min && !found[i])
        {
            min = shortcut[i];
            minpos = i;
        }
    return minpos;
}

void shortest_path(int cost[][nstation])
{
    /* shortcut[] means the shortest path between YMC and goal station */
    /* visited[] and found[] record the node had visited */
    int i,j,nextNode,found[nstation],mark[nstation],path[nstation][nstation],shortcut[nstation],visited[nstation],stack[nstation];
    for(i=0; i<nstation; i++){
        stack[i] = -1;  /* stack[] save the possible best way */
        found[i] = visited[i] = mark[i] = 0;
        shortcut[i] = INT_INFINITE;
    }
    shortcut[0] = 0;

    for(i=0; i<nstation-1; i++){
        nextNode = choose(shortcut,found);
        found[nextNode] = 1;

        for(j=0; j<nstation; j++){  /* find the shortest route between nextNode and station(j) */
            if(!found[j])
                if(shortcut[nextNode] + cost[nextNode][j] < shortcut[j]){
                    shortcut[j] = shortcut[nextNode] + cost[nextNode][j];
                    mark[j] = 1;  /* mark[j] = 1 means there has the only one shortest path from nextNode to j */
                    path[j][1] = nextNode;  /* path[j][1] record the node which is the shortcut to j */
                }
                else if(shortcut[nextNode] + cost[nextNode][j] == shortcut[j]){  /* if there has the same shortest route */
                    mark[j]++;  /* there has (num)mark[j] shortest path */
                    path[j][mark[j]] = nextNode;  /* path[j][mark[j]] record the number (num)mark[j] node can be a shortest shortcut path to j */
                }
        }
        if(nextNode == goal) break;
    }

    int ANS[nstation]; /*record the best path*/
    best_path(goal,mark,path,visited,stack,&ANS[0]);
    printf("%d 0",bring_out);
    for (i=nstation-1; i>=0; i--) /*print the best path*/
    {
        if(ANS[i]>0)
            printf(">%d",ANS[i]);
    }
    printf(" %d\n",bring_back);
}

int main()
{
    scanf("%d %d %d %d",&capacity,&nstation,&goal,&npath);
    nstation++;

    int i,j;
    for(i=1; i<nstation; i++)   /* input the number of bikes of each station */
    {
        scanf("%d",&nodeBikes[i]);
    }
    nodeBikes[0] = capacity/2;

    int cost[nstation][nstation];
    for(i=0; i<nstation; i++)   /* initialize the distance */
    {
        for(j=0; j<nstation; j++)
            cost[i][j] = INT_INFINITE;
        cost[i][i] = 0;
    }

    int node1,node2,length;
    for(i=0; i<npath; i++)  /* set the distance */
    {
        scanf("%d %d %d",&node1,&node2,&length);
        cost[node1][node2] = cost[node2][node1] = length;
    }
    shortest_path(cost);

    return 0;
}
