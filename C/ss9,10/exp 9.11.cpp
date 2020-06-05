#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num;
	labell:
		printf("Enter a number :");
		scanf("%d",&num);
		if(num==1)
			goto Test;
		else 
			goto labell;
	Test:
		printf("All done...");
	
	return 0;
}
