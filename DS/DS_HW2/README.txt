403410016 HWB_BST version 1.9 2015/11/14

GENERAL USAGE NOTES
-------------------------------------------------------------------------

 - The program of HWB has two parts:

 <<Binary Search Tree>>
   Impliment a binary search tree for positive integer numbers and provide
   the following functions:
   
   insert(i) insert a node i; error out when it has existed.
   
   delete(i) delete node i; error out when it is not existing. Right child
             has higher priority to be delete.
   search(i) find the node i in tree; message out whether the number i is 
             found or not.
   printInfixOrder() print the whole tree in infix order.(from left to right)

   printLevelOrder() print the whole tree in level order.(from top to base)

 <<Treasure Hunter>>
   First, you should insert the filename of the map.
   Load a map file to construct the BST maze, then input the position of a
   key and a treasure. Show the shortest path which the treasure hunter went
   through to find the treasure. Message out if the treasure hunter could 
   not find the key or treasure.

 - How to compile:
   - make  (with Makefile and source code "HWB_BST.c" in the same direction)
  or
   - gcc HWB_BST.c -g -o HWB_BST

 - Execution environment is on csie workstation. (FREEBSD 9.0)

 - You can directly excute the HWB_BST*, and then choose the options to
   check the answer.

-------------------------------------------------------------------------
