#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int finder( char ch1, char str1[20]);
	char str[20];
	char ch;
	int n,x=0;
	
	for(n=0;n<5;n++)
	{
		printf("\n\n Nhap chuoi string : ");
		scanf("%s", str);
		fflush(stdin);
		printf("\n Nhap ky tu can tim trong string : ");
		scanf("%c",&ch);
		fflush(stdin);
		x = finder(ch,str);
		printf("\n So lan xuat hien cua %c trong %s la : %d ",ch,str,x);
	}
	
}
int finder(char ch1, char str1[20])
{
	int i, appear,len;
	len = strlen(str1);
	for(i=0,appear=0;i<len;i++)
	{
		if(str1[i] == ch1)
		{
			appear += 1;
		} 
	}
	return(appear);
}
