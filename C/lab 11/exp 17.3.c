#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char str1[20],str2[20];
	
	printf("\n Enter string 1 : ");
	gets(str1);
	printf("\n Enter string 2 : ");
	gets(str2);
	strcat(str1,str2);
	puts(str1);
	return 0;
}
