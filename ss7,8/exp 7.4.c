#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x;
	x=0;
	 printf("An mot so bat ky (1-3): ");
	 scanf("%d",&x);
	if (x==1)
		printf("\n Choice is 1");
	else if (x==2)
		printf("\n Choice is 2");
	else if (x==3)
		printf("\n Choice is 3");
	else 
	printf("\n Invalid Choice");			

}
