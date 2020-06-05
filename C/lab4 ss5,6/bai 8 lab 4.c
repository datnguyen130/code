#include <stdio.h>
#include <stdlib.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	printf("Kich thuoc cac kieu du lieu: \n");
	printf("\nKieu int: %d byte", sizeof(int));
	printf("\nSo nguyen: %d", 1);
	
	printf("\n\nKieu float: %d byte", sizeof(float));
	printf("\nSo thuc kieu float: %f",0.333);
	
	printf("\n\nKieu double: %d byte", sizeof(double));
	printf("\nSo thuc kieu double: %.8lf",0.33333333);
	
	printf("\n\nKieu char: %d byte", sizeof(char));
	printf("\n Ky tu: %c",'A');
	
	printf("\n\nKieu long int: %d byte", sizeof(long int));
	printf("\nSo kieu long int: %ld", 9999999);
	
	printf("\n\nKieu long double: %d byte", sizeof(long double));
	
	
	
	return 0;
}
