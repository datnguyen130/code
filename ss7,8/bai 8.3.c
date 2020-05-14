#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char ch;
	printf("\nnhap mot chu cai : ");
	scanf("%c", &ch);
	switch(ch)
	{
		case'A':
		case'a':
			printf("Ada language");
			break;
		case'B':
		case'b':
			printf("Basic language");
			break;
		case'C':
		case'c':
			printf("COBOL language");
			break;
		case'D':
		case'd':
			printf("dBASE III language");
			break;
		case'f':
		case'F':
			printf("Fortran language");
			break;
		case'p':
		case'P':
			printf("Pascal language");
			break;
		case'v':
		case'V':
			printf("Visual C++ language");
			break;
		default:
			printf("does not match any character");
			break; 	
	}
	return 0;
}
