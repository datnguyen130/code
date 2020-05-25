#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


void main() {
int ary[5];
int sum = 0,i;
int sum_ary(int num_ary[5]);

for (i=0;i<5;i++)
	{
	printf("\n Nhap vao gia tri cua so thu no.%d :  ",i+1);
	scanf("%d",ary+i);
	}
sum = sum_ary(ary);
printf("\n Tong cua cac so trong mang la : %d",sum);
	
}

int sum_ary(int num_ary[5])
{
	int i,summ = 0;
	for(i=0;i<5;i++)
	summ+=*(num_ary+i);
	return(summ);
	
}
