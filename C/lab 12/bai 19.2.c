#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct class {
	char name[20];
	float point;
};

int main( ) {
	int i,j;
	struct class student[5];
	struct class temp ;
	
	for(i=0;i<5;i++)
	{
		printf("\n Nhap ten hoc sinh : ");
		gets(student[i].name);
		fflush(stdin);
		printf("\n Nhap diem mon hoc : ");
		scanf("%f",&student[i].point);
		fflush(stdin);
	}
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(student[i].point < student[j].point)
			{
				temp = student[i];
				student[i] = student[j];
				student[j] = temp;
				 
			}
		}
	}
	printf("\n XEP HANG CAC HOC SINH : ");
	for(i=0;i<5;i++)
	{
		printf("\n Hoc sinh %s xep thu %d voi so diem la : %f ", student[i].name, i+1, student[i].point);
	}
	printf("\n 3 diem so cao nhat la : ");
	for(i=0;i<3;i++)
	printf("%f", student[i].point);
	
	
	
	return 0;
}
