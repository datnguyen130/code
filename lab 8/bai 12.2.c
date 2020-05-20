#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x,i,j = 0;
	char ary[100];
	
	printf("\n Enter the strings : ");
	scanf("%s",&ary);
	
	x = strlen(ary);
	
	for(i=0;i<x;i++)
	{
		switch(ary[i])
		{
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e': 
			j++;
			break;
		}
	}
	
	printf(" so cac ki tu la nguyen am la : %d",j);
	printf("\n so cac ki tu la phu am la : %d",x - j);
	return 0;
}
