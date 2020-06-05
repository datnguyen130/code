#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


incre ( )
{
	static char x;
	x=65;
	printf("\nThe chracter stored in X is %c ", x++);
}




 main ()
{
	
	incre();
	incre();
	incre();
	
}
