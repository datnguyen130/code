#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main() {
	char str1[20],str2[10],str3[10];
	int ptr,len_str1,len_str2,i,j;
	printf("\n Nhap string 1 : ");
	gets(str1);
	printf("\n Nhap string 2 : ");
	gets(str2);
	len_str1 = strlen(str1);
	len_str2 = strlen(str2);
	
	for(i = 0,j = len_str1 -len_str2 ;i<len_str2,j<len_str1;i++,j++)
	str3[i] = str1[j];
	
	ptr = strcmp(str2,str3);
	if(ptr == 0 )
	printf("\nString 2 o cuoi Strng 1 \nEND");
	else printf( "\nEND");
	
	
	return 0;
}
