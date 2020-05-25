#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

float dientich(int x);
float chuvi(int x);
void main ()
{
	int x,gt;
	printf("\n Nhap mot so bat ki : ");
	scanf("%d",&x);
	gt = giaithua(x);
	printf("\nGiai thua cua so %d la %d",x,gt);
	return;
	
}
int giaithua(int a)
{
	int gt,i;
	if(a == 0|| a == 1)
	gt = 1;
	else
	{	gt =1;
		for(i=1;i<=a;i++)
		gt = gt *i;
	}
	return(gt);
}






