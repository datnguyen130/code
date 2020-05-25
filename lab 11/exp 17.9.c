#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


void main() {
	char line[5][20];
	int i;
	int longest(char line1[5][20]);
	int longline;
	for(i=0;i<5;i++)
	{
		printf("\n Nhap vao chuoi thu %d : ",i+1);
		scanf("%s",line + i);
	}
	
	longline = longest(line);
	printf("\n The longest line is : %s",line[longline]);
}
int longest(char line1[5][20])
{
	int i,pre_len,new_len,line_no;
	i=0;
	pre_len = strlen((line1+i));
	for(i=1;i<5;i++)
	{
		new_len = strlen((line1+i));
		if(new_len > pre_len)
		line_no = i ;
		pre_len = new_len;
	}
	
	return(line_no);
}
