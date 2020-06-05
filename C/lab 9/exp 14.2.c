#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char *ptr[5];
	int i,j;
	char str1[5][10],str2[5][10];
	char *temp;
	
	for(i=0;i<5;i++)
	{
		printf("\n Enter the string : ");
		scanf("%s",str1[i]);
		ptr[i]=str1[i];
	}
	
	for(i=0;i<5;i++)
	strcpy(str2[i],str1[i]);
	
	for(i=0;i<4;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if ( strcmp(ptr[i],ptr[j] ) >0 )
			{
				temp = ptr[i];
				ptr[i]=ptr[j];
				ptr[j]=temp;
			}
		}
	}
	
	printf("\n\n The original list is ");
	for(i=0;i<5;i++)
	printf("\n %s",str2[i]);
	
	printf("\n\n The sotred list is ");
	for(i=0;i<5;i++)
	printf("\n %s",ptr[i]);
	
	return 0;
}
