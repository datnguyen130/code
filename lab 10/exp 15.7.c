#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */




 main ()
{
	int a,b;
	int *pa, *pb;
	

	printf("\n Enter interger 1 : ");
	scanf("%d",&a);
	pa = &a;
	
	printf("\n Enter interger 2 : ");
	scanf("%d",&b);
	pb = &b;
	swap(pa,pb);
	
	printf("\na va b sau khi doi cho la a = %d, b = %d",a,b);
	return;
}

int swap ( int *px,  int *py)
{
	int temp;
	temp = *px;
	*px = *py;
	*py = temp;
	return;
	
}
