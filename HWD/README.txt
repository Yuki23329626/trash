403410016 HWD 2015/12/25

GENERAL USAGE NOTES
-------------------------------------------------------------------------

 - It is a program which impliment a database query processor. First it 
   provide a user an interface to query data from the database by inputting
   the query command. Second, it need to read the raw data from a database
   read from file that you have inserted, and to process the query command.
   Finally, it will output the result to users.

 - struct contact
   {
      int order;
      char id[11];
      char FirstName[10];
      char LastName[10];
      char Gender[2];
      char Age[3];
      char PhoneNum[15];
   };

 - Query command format:
   SELECT [columns] FROM [FileName].csv
   ORDER BY col_1 [ASC/DESC] -[1/2] [, col_2 [ASC/DESC] -[1/2]]

   1. 'SELECT','FROM','ORDER BY' are case-insensitive, and others are 
      case-sensitive.
   2. All the query commands can only be inputted in a single line
   3. In the query command, SELECT and FROM clauses are required.
   4. In case of any other incomplete or wrong commands will error out.

 - I choose quick sort and insertion sort to do my projrct D.
   Since the quick sort is not a stable sort, so I revise the compare function
   and the struct_type to make it stable. I just simply add an order into
   struct_type and use the order to do the sort while two data are the same.

 - My quick_sort() can be used just like the qsort() in the stdlib.h.

 - How to compile:
   - make  (with Makefile and source code "403410016.c" in the same direction)
  or
   - gcc 403410016.c -g -o 403410016.exe

 - Execution environment is FreeBSD csie0.cs.ccu.edu.tw

 - You can directly execute the HWD.exe, and insert the input data to check 
   the answer.

-------------------------------------------------------------------------
