#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>
#include <time.h>

int fish_num = 0;  // the amount of caught fishes
void castRod(int);
void quitFishing(int);
void fishEscaped(int);
void pullFailed(int);
void pullSuccess(int);
void biting(int);
void noBiting(int);

int main()
{
	printf("Fishing rod is ready!\n");
	signal(SIGINT, castRod);
	signal(SIGTSTP, quitFishing);
	while(1)
		pause();

	return 0;
}

void quitFishing(int signum)
{
	printf("\nTotally caught fishes : %d\n",fish_num);
	exit(0);
}

void fishEscaped(int signum)
{
	printf("The fish was escaped!!\n");
	signal(SIGINT, pullFailed);
}

void pullFailed(int signum)
{
	printf("\nPull the fishing rod\n");
	printf("The bait was eaten!!\n");
	printf("Fishing rod is ready!\n");
	signal(SIGINT, castRod);
}

void pullSuccess(int signum)
{
	signal(SIGALRM, SIG_IGN);// ignor the last signal of alarm
	printf("\nPull the fishing rod\n");
	printf("Catch a Fish!!\n");
	printf("Totlaly caught fishes : %d\n", ++fish_num);
	printf("Fishing rod is ready!\n");
	signal(SIGINT, castRod);
}

void biting(int signum)
{
	printf("A fish is biting, pull the fishing rod\n");
	signal(SIGALRM, fishEscaped);
	alarm(3);
	signal(SIGINT, pullSuccess);
}

void noBiting(int signum)
{
	printf("\nPull the fishing rod\n");
	printf("Fishing rod is ready!\n");
	signal(SIGALRM, SIG_IGN); // ignore the last signal of alarm
	signal(SIGINT, castRod);
}

void castRod(int signum)
{
	signal(SIGALRM, biting);	
	printf("\nCast the fishing rod\n");
	printf("Bait into the water, waiting fish...\n");
	
	srand(time(NULL));
	int bitTime = rand()%3+3;
	alarm(bitTime);
	signal(SIGINT, noBiting);
}
