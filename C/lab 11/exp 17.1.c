#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char name[20];
	puts("Enter your name :");
	gets(name);
	puts("Hi there : ");
	puts(name);
	return 0;
}
