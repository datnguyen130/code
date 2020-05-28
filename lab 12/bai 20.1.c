#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct exe  {
	char name[10];
	float yard;
	float inch;
	float feet;
	
};

int main( ) {
	struct exe length[5];
	int i,j;
	struct exe temp;
	
	for(i=0;i<5;i++)
	{
		printf("\n Enter the name's length : ");
		gets(length[i].name);
		fflush(stdin);
		printf("\n Enter the length no.%d in inches : ",i+1);
		scanf("%f",&length[i].inch);
		fflush(stdin);
		length[i].yard = length[i].inch * 36;
		length[i].feet = length[i].inch * 12;
	}
	
	for(i=0;i<4;i++)
	{
		for(j=i+1;j<5;j++)
		{
			if(length[i].inch < length[j].inch)
			{
				temp = length[j];
				length[j] = length[i];
				length[i] = temp;
			}
		}
	}
	printf("\n The sort length is : ");
	for(i=0;i<5;i++)
	printf("  %s ,", length[i].name );
	
} 


