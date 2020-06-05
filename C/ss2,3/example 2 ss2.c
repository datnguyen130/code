#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	x=5;
	y=2;
	printf(" hai so nguyen la : %d & %d\n", x,y);
	printf(" tong hai so la : %d\n", x+y);
	printf(" hieu hai so la : %d\n", x-y);
	printf("tich hai so la : %d\n", x*y);
	printf("thuong hai so la : %d\n",x/y);
	printf("so du trong phep chia la : %d\n",x%y);
	getchar();
	return 0;
}
