#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */



void check (char *a, char *b,int (*cmp)());
 main ()
{
	char s1[80],s2[80];
	int (*p)();
	p = strcmp;
	gets(s1);
	gets(s2);
	check(s1,s2,p);
	return;
}

void check (char *a, char *b, int (*cmp)())
{
	printf("testing for equality \n");
	if((*cmp)(a,b) == 0)
	{
		printf("Equal");
		
	}
	else 
	printf("Not equal");
	printf("\n%d", (*cmp)(a,b));
	
}
