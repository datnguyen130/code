#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float toan,ly,hoa,sum;
	printf("nhap diem mon toan : ");
	scanf("%f",&toan);
	printf("\nnhap diem mon hoa :");
	scanf("%f",&hoa);
	printf("\nnhap diem mon ly : ");
	scanf("%f",&ly);
	sum=toan+ly+hoa;
	printf("\ntong diem 3 mon hoc la : %.1f",sum);
	printf("\ndiem trung binh 3 mon la : %.1f", sum/3);
	return 0;
}
