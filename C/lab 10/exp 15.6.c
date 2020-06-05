#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */




 main ()
{
	int a,b;
	a = b = 0;
	printf("\n Enter interger 1 : ");
	scanf("%d",&a);
	
	printf("\n Enter interger 2 : ");
	scanf("%d",&b);
	swap(a,b);
	
	printf("\na va b sau khi doi cho la a = %d, b = %d",a,b);
	return(0);
}

int swap (int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
	return;
}
