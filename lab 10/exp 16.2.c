#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


void main ()
{
	int a,b,c,sum;
	printf("\n Nhap vao 3 gia tri bat ki : ");
	scanf("%d %d %d",&a,&b,&c);
	sum =  calculatesum(a,b,c);
	printf("\n Sum = %d",sum);
	return(0);
}

int calculatesum( int x, int y, int z)
{
	int d;
	d = x + y + z;
	return(d);
}



