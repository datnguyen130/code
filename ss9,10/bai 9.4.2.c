#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	for(x=5;x>0;x--)
	{
		printf("\n");
		for(y=1;y<=x;y++)
		{
			printf("%d",y);
		}
	}
	return 0;
}
