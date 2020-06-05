#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char str[100],temp[100];
	int n,i,j;
	
	printf("\n Nhap chuoi ban muon nhap : ");
	gets(str);
	
	n = strlen(str);
	
	for(i=0,j=n-1;i<n,j>=0;i++,j--)
	*(temp + j) = *(str + i);
	
	printf("\n Chuoi dao nguoc la : %s",temp);
	return 0;
}
