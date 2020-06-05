#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char str[10][20], temp[20];
	int n,i,j;
	
	printf("\n NHAP VAO CAC CHUOI");
	printf("\n Nhap END khi ket thuc ");
	
	do{
		printf("\n Nhap vao chuoi string no.%d : ",n+1);
		scanf("%s",str + n);
	} while(strcmp(str[n++],"END"));
	n = n -1;
	
	for(i=0;i<n - 1;i++)
	{
		for(j = i+1; j<n ; j ++)
		{
			if(strlen(str[j]) > strlen(str[i]))
			{
				strcpy(temp,str[i]);
				strcpy(str[i],str[j]);
				strcpy(str[j],temp);
				
			}
		}
	}
	
	printf("\n Cac chuoi sau khi sap xep theo do dai giam dan la : ");
	for(i=0;i<n;i++)
	printf("\n Chuoi string no.%d : %s ",i+1,str[i]);
	return 0;
}
