#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(int argc, char *argv[]) {
	printf("A string in various forms :\n");
	printf("Without any format coommand :\n");
	printf("Good day Mr. Lee. \n");
	printf("With format command but without any modifier: \n");
	printf("[%s]\n","Good day Mr. Lee.");
	printf("with digit string 4 as modifier :\n");
	printf("[%4s]\n","Good day Mr. Lee.");
	printf("with digit string 19 as modifier: \n");
	printf("[%19s]\n","Good day Mr. Lee.");
	printf("with digit string 23 as modifier: \n");
	printf("[%23s]\n","Good day Mr. Lee.");
	printf("with digit string 25.4 as modifier: \n");
	printf("[%25.4s]\n", "Good day Mr. Lee. ");
	
	return 0;
}
