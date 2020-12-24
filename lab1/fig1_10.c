#include "apue.h"
#include <sys/wait.h>

static void	sig_int(int);		/* our signal-catching function */
int
main(void)
{
		char	buf[MAXLINE];	/* from apue.h */
		pid_t	pid;
		int	i,status;

		if (signal(SIGINT, sig_int) == SIG_ERR)
				err_sys("signal error");

		printf("## ");	/* print prompt (printf requires %% to print %) */
		while (fgets(buf, MAXLINE, stdin) != NULL) {
				if (buf[strlen(buf) - 1] == '\n')
						buf[strlen(buf) - 1] = 0; /* replace newline with null */
				i=1;
				char *argv[80],*token;
                                token = strtok(buf," ");
                                argv[0] = token;
				while(token!=NULL)
                                {
					token = strtok(NULL," ");
                                       argv[i++] = token;
                                }
				if(strcmp(argv[0],"cd")==0)
				{
					chdir(argv[1]);
					continue;
				}

				if ((pid = fork()) < 0) {
						err_sys("fork error");
				} else if (pid == 0) {		/* child */
						//printf("child\n");
						execvp(argv[0],argv);
						//execlp(buf, buf, (char *)0);
						err_ret("couldn't execute: %s", buf);
						exit(127);
				}

				/* parent */
				if ((pid = waitpid(pid, &status, 0)) < 0)
				{
					//printf("parent\n");
					err_sys("waitpid error");
				}
				printf("## ");
		}
		exit(0);
}

		void
sig_int(int signo)
{
		printf("interrupt\n%% ");
}

