#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int sosanh (char *a,char *b,int (*p)());
int main() {
	
	int (*cmp)();
	char name1[15] = "Geena";
	char name2[15] = "Drothy";
	char name3[15] = "Shania";
	char name4[15] = "Geena";
	int i,j;
	cmp = strcmp;
	i = sosanh(name1, name2, cmp);
	printf("\n i1 = %d",i);
	printf("\n Geena compared with Drothy returnd %d",strcmp(name1,name2));
	printf("\n i2 = %d", sosanh(name1, name3,cmp) );
	printf("\n Geena compared with Shania return %d ",strcmp(name1,name3));
	printf("\n i3 = %d", sosanh(name1,name4,cmp));
	return 0;
}
int sosanh (char*a,char*b,int(*p)())
{
	int x;
	x=strcmp(a,b);
	return (x);
}
