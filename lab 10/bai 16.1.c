#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

float dientich(int x);
float chuvi(int x);
void main ()
{
	int r;
	float P,S;
	printf("\n Nhap vao ban kinh hinh tron : ");
	scanf("%d",&r);
	S = dientich(r);
	P = chuvi(r);
	printf("\n Dien tich hinh tron la : %.2f", S);
	printf("\n Chu vi hinh tron la : %.2f ",P);
	return;
}
float dientich(int x)
{
	float s;
	s = x * x *3.14;
	return(s);
}
float chuvi(int x)
{
	float p;
	p = 2 * x * 3.14;
	return(p);
}






