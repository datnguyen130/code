#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char name[5][20];
	int i;
	void uppername(char str1[]);
	
	for(i=0;i<5;i++)
	{
		printf("\n Nhap vao stirng no.%d : ",i+1);
		scanf("%s", name+i);
	}
	for(i=0;i<5;i++)
	{
		uppername(name +i);
		printf("\n String no.%d sau khi upper la : %s",i+1,name[i]);
	}
	return 0;
}

void uppername(char str1[])
{
	int n;
	for(n=0;str1[n] != '\0';n++)
	{
		if (str1[n] >= 97 && str1[n]<=122)
		str1[n] = str1[n] - 32;
	}
}
