#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,y;
	printf("Nhap vao mot so : ");
	scanf("%d",&x);
	for(y=1;y<=9;y++)
	printf("\n %d * %d = %d", x,y,x*y);
	
	return 0;
}
