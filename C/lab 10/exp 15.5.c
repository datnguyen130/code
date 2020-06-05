#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int adder (int a, int b )
{
	int c;
	c= a + b;
	a *= a;
	b+=5;
	printf("\n a va b trong ham adder la %d , %d ",a,b);
	printf("\n c trong ham adder la %d ",c);
	return(c);
}


 main ()
{
	int a,b,c;
	a = b = c = 0;
	printf("\n Enter interger 1 : ");
	scanf("%d",&a);
	
	printf("\n Enter interger 2 : ");
	scanf("%d",&b);
	
	c = adder(a,b);
	
	printf("\na va b trong ham main la %d,  %d",a,b);
	printf("\nc trong ham main la %d",c);
	
}
