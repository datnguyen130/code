#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
float average (float ary1[]);
void main() {
	float ary[5];
	int i;
	float avg ;

	for(i=0;i<5;i++)
	{
		printf("\n Nhap vao gia tri cua so thu no.%d : ",i+1);
		scanf("%f",ary+i);
	}
	avg = average(ary);
	printf("\nTrung binh cong cua cac so tren la : %.2f",avg)	;
	return;
}
float average (float ary1[])
{
	int x, sum = 0;
	float avg1 ;
	for(x=0;x<5;x++)
	{
		sum += *(ary1 +x);
	}
	avg1 = ((float) sum /x);
	return(avg1);
}
