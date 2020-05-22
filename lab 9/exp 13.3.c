#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(int argc, char *argv[]) {
	char a,str[81],*ptr;
	printf("\n Enter a sentence : ");
	gets(str);
	printf("\Enter character to search for :");
	a = getchar();
	ptr=strchr(str,a);
	printf("\n Chuoi bat dau tai dia chi : %u",str);
	printf("\n Chu cai can tim duoc tim thay dau tien tai dia chi : %u",ptr);
	printf("\n Khoang cach giua hai dia chi ( tinh tu dia chi dau tien) la : %u",ptr - str);
	return 0;
}
