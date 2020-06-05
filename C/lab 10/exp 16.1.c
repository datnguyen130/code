#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */



void check (char *a, char *b,int (*cmp)());
 main ()
{
	printf("\n I am in main");
	Hanoi();
	Danang();
	Saigon();
	Moon();
	return;
}

Hanoi ()
{
	printf("\n I am in Ha Noi");
}

Danang()
{
	printf("\n I am in Da Nang");
}

Saigon()
{
	printf("\n I am in Sai Gon");
}

Moon()
{
	printf("\n I am in Moon");
}
