#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	float per;
	printf("nhap diem 3 mon:  ");
	scanf("%d%d%d",&a,&b,&c);
	per = (a + b + c)/3;
	if (0<= a && a <= 100 && 0 <= b && b <= 100 && 0 <= c && c <= 100)
	{
	if (90 <= per && per <= 100)
		printf ("\ngrade : E+");
	else if (80 <= per && per < 90)
		printf("\ngrade : E");
	else if (70 <= per && per < 80)
		printf("\ngrade : A+");
	else if (60 <= per && per < 70)
		printf("\ngrade : A");
	else if (50<= per && per < 60)
		printf("\ngrade : B+");
	else 
		printf("\nFAIL");
	}
	else 
	printf("nhap sai diem. Hay nhap lai!");
	
	return 0;
}
