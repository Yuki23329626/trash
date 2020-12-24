
403410016 HWC 2015/12/13

GENERAL USAGE NOTES
-------------------------------------------------------------------------

 - It's a program which used the dijkstra and the DFS to find the shortest
   and the best way to deliver the bicycles from YMC to the target bicycle
   station.
 
 - Each input is a test case.For each case, the 4 numbers in first line
   are:
   1. the maximun capicity of a YouBike station
   2.the number of the YouBike stations
   3.the dstination of YouBike station
   4.the number of road segments
   
   second line:
   the number (i)th contains the current number of bikes at station (i)

   from third line to end ( there has [4.the number of road] lines ):
   - each line has three element:
   - - [node_1] [node_2] [the length from node_1 to node_2]

 - The program uses these informations to find out the best way to 
   deliver the bicycles to the destination of YouBike station.

 - How to compile:
   - make  (with Makefile and source code "HWC.c" in the same direction)
  or
   - gcc HWC.c -g -o HWC

 - Execution environment is FreeBSD csie0.cs.ccu.edu.tw

 - You can directly execute the HWC, and insert the input data to check 
   the answer.

-------------------------------------------------------------------------
