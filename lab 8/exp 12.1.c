#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n,i,j,k,l,item,m;
	int num[100];
	int lum[100];
	
	printf("\n Enter the total numbers to be entered : ");
	scanf("%d",&n);
	
	for(l=0;l<n;l++)
	{
		printf("\nEnter the marks of student no.%d : ",l+1);
		scanf("%d",&num[l]);
	}
	
	for(j=0;j<n;j++)
	lum[j]=num[j];
	
	for(i=0;i<n-1;i++)
	{
		for(k=i+1;k<n;k++)
		{
			if(lum[i]<lum[k])
			{
				item = lum[i];
				lum[i] = lum[k];
				lum[k] = item;
			}
		}
	}
	for(m=0;m<n;m++)
	printf("\nNumber at [%d] is %d ",m,lum[m]);
	return 0;
}
