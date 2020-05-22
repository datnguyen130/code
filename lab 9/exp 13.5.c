#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int number;
	int *ptr;
	int i;
	
	printf("\n Enter total ints you want to store : ");
	scanf("%d",&number);
	
	ptr = (int *) malloc (number*sizeof(int));
	
	if(ptr != NULL)
	{
		for(i=0;i<number;i++)
		{
			*(ptr+i)=i;
		
		}
		for(i=number;i>0;i-=1)
		{
			printf("%d\n",*(ptr+(i-1)));
		}
		free(ptr);
		return 0;
	}
	
	else
	{
		printf("\n The memory allocation failed - not enough memory.\n");
		return 1;
	}		

}
