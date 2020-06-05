#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


void main ()
{
	int a,b;
	printf("\n Nhap mot gia tri bat ki : ");
	scanf("%d",&a);
	b = square(a);
	printf("\n gia tri binh phuong cua so ban da nhap la : %d",b);
	return;
}

int square(int x)
{
	return (x*x);
}


