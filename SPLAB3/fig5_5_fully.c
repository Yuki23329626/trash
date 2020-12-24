#include "apue.h"

int main(void)
{
	char buf[MAXLINE];
	int count = 0;

	setvbuf(stdin,buf,_IOFBF,4096);

	while( (fgets(buf,MAXLINE,stdin)) != NULL ){
		count++;
		if(fputs(buf,stdout) == EOF)
			err_sys("output error");
	}
	printf("loop = %d\n",count);
		
	if(ferror(stdin))
		err_sys("input error");

	exit(0);
}

