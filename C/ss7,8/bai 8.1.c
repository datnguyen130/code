#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float x,y;
	printf(" nhap hai so x,y :");
	scanf("%f%f", &x,&y);
	if (x < 2000 || x > 3000)
		{
		printf ("gia tri cua X la : %f",x);
		}
	if (100 < y && y < 500)
	    {
		printf("\ngia tri cua Y la : %f",y);
		}
	return 0;
}
