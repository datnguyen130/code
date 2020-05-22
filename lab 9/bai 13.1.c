#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main() {
	char str[100],temp[100];
	int n,i,j;
	
	printf("\n Nhap chuoi ban muon nhap : ");
	gets(str);
	
	n = strlen(str);
	
	for(i=0,j=n-1;i<n,j>=0;i++,j--)
	*(temp + j) = *(str + i);
	
	
	
	if(n % 2 != 0)
	{
		printf("\nSo cac phan tu trong chuoi la so le ");
	}
	else if(n % 2 == 0)
	{	
		for(i=0;i<n;i++)
		{
			if(*(temp+i) == *(str+i));
		}
		printf("\n Chuoi doi xung \n Chuoi la %s",temp);
		
	}
	return 0;
}
