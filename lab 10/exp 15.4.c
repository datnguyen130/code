#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main ()
{
	register int i;
	int no, digit, sum = 0;
	
	for(i=0;i<999;i++)
	{	
		no = i;
		sum = 0;
		while(no)
		{
			digit = no %10;
			no = no/10;
			sum = sum + digit*digit*digit;
		}
		if(sum==i) printf("\t %d",i);
	}
	
}
