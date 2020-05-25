#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int square (int x)
{
	return(x*x);
}




void main ()
{
	int i;
	for(i=0;i<=10;i++)
	printf("\n Square of %d is %d ",i,square(i));
	return;
	
}
