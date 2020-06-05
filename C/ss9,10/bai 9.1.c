#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num;
	for(num = 100; num >= 5;num-=5)
	{
		if(num % 5 != 0) continue;
		printf("%d \t",num);	
	}
	return 0;
}
