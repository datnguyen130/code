#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,j,k,l;
	char x[10][10];
	char z[10];
	printf("\nEnter the String line : ");
	printf("\nEnter 'END' when you done! ");
	
	do
	{
		printf("\n Enter the strings %d : ",i+1);
		scanf("%s",&x[i]);
	} while(strcmp(x[i++],"END"));
	i=i-1;
	
	for(j=0;j<i-1;j++)
	{
		for(k=j+1;k<i;k++)
		{
			if(strcmp(x[j],x[k])>0)
			{
				strcpy(z,x[j]);
				strcpy(x[j],x[k]);
				strcpy(x[k],z);
			}
		}
	}
	
	for(l=0;l<i;l++)
	printf("\nString %d : %s",l+1,x[l]);
	return 0;
}
