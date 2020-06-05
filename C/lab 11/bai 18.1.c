#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	void fullname(char sur1[10], char name1[20]);
	char name[5][20], sur[10];
	int i;
	printf("\n Nhap chuc danh : ");
	scanf("%s",sur);
	fflush(stdin);	
	for(i=0;i<5;i++)
	{
		printf("\n Nhap vao ten : ");
		scanf("%s",name+i);
		fflush(stdin);
	}
	for(i=0;i<5;i++)
	{	
		fullname(sur,name+i);
		printf("\n Ten day du la : %s",name +i);	
	}
}
void fullname (char sur1[10], char name1[20])
{	char sur2[10]; 
	char ch1[5] = " ";
	strcpy(sur2,sur1);
	strcat(sur1,ch1);
	strcat(sur1,name1);
	strcpy(name1,sur1);
	strcpy(sur1,sur2);
	
}
