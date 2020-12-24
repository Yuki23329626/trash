#include <stdio.h>

void func(int *p){
	*p = *p+1;
}

int main(){
	int i;
	int *num = 0;
	for(i=0;i<5;i++){
		func(num);
	}
	return 0;
}
