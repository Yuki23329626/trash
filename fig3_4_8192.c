#include "apue.h"
#include <fcntl.h>
//#include <sys/socket.h>
//#include <stdio.h>

#define	BUFFSIZE	8192

int main(void)
{
		int	fd,n;
		char	buf[BUFFSIZE];

		fd = open("/dev/null",O_RDWR);
		while ((n = read(STDIN_FILENO, buf, BUFFSIZE)) > 0){
			if (write(fd, buf, n) != n)
				err_sys("write error");
			//fsync(fd);
		}

		if (n < 0)
			err_sys("read error");

		exit(0);
}

