#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c,sum;
	float per;
	printf("nhap diem 3 mon ");
	scanf("%d%d%d",&a,&b,&c);
	if (0<= a && a <= 100 && 0 <= b && b <= 100 && 0 <= c && c <= 100)
		printf(" Tiep tuc xep loai ");
	else 
		printf(" Nhap sai diem. Xin moi nhap lai");

	return 0;
}
