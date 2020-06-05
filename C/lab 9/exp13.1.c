#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(int argc, char *argv[]) {
	int var = 500, *ptr_var;
	ptr_var = &var;
	printf("gia tri %d duoc luu tai dia chi %u ", var,&var);
	printf("\n gia tri %u duoc luu tai dia chi %u",ptr_var,&ptr_var);
	printf("\n gia tri %d duoc luu tai dia chi %u",*ptr_var,ptr_var);
	return 0;
}
