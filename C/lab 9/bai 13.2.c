#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main() {
	char ani[100],bird[100],temp[100],s[10];
	int a,b,i;
	
	printf("\nEnter one name of animal : ");
	gets(ani);
	a = strlen(ani);
	*(s)='s';
	for(i=0;i<a;i++)
	{
		strcpy(temp,ani);
	}
	
	strcpy((temp+a),s);
	
	printf("\nThe name in plural is %s",temp);
	
	return 0;
}
