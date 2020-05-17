#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a1,a2,giaithua;
	giaithua=1;
	printf("nhap vao mot so : ");
	scanf("%d",&a2);
	for(a1=1;a1<=a2;a1++)
	{
		giaithua=giaithua*a1;
	}
	printf("giai thua cua %d la %d",a2,giaithua);
	
	
	return 0;
}
