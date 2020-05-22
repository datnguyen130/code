#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char str1[10],str2[10],str3[20];
	int n1,n2,i,j;
	
	printf("\nEnter string 1 : ");
	gets(str1);
	
	printf("\nEnter string 2 : ");
	gets(str2);
	
	n1 = strlen(str1);
	n2 = strlen(str2);
	
	for(i=0;i<n1;i++)
	{
		strcpy(str3 + i,str1 + i);
	}
	
	for(i=n1,j=0;i<n1+n2,j<n2;i++,j++)
	{
		strcpy(str3 + i,str2 + j);
	}
	
	printf("\nString 3 : %s",str3);
	return 0;
}
