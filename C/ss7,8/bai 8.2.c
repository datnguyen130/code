#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
float a1,a2,a3;
printf(" Nhap 3 so bat ky : ");
scanf("%f%f%f",&a1,&a2,&a3);

if(a1 == a2 && a1 == a3)
	printf("\nBa so a1,a2,a3 bang nhau");
if(a1 > a2)
{
	if(a1 > a3)
	printf("\n a1 = %f la gia tri max",a1);
	else if(a1 < a3)
	printf("\n a3 = %f la gia tri max",a3);
	else 
	printf("\n a1 = a3 = %f la gia tri max",a1);
}
if(a1 < a2)
{
	if(a2 > a3)
	printf("\n a2 = %f la gia tri max", a2);
	else if(a2 < a3)
	printf("\n a3 = %f la gia tri max", a3);
	else 
	printf("\n a2 = a3 = %f la gia tri max", a2);
}
if(a1 == a2)
{
	if( a1 > a3)
	printf("\n a1 = a2 = %f la gia tri max", a1);
	else if( a1 < a3)
	printf("\n a3 = %f la gia tri max",a3);
}
	return 0;
}
