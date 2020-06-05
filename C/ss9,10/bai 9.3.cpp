#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i1 = 0, i2 = 1, i3;
	printf("%d , %d ,",i1,i2);
	for(;;)
	{
		i3= i1 + i2;
		printf(" %d ,",i3);
		i1= i2;
		i2= i3;
		
	}
	return 0;
}
