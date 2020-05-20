#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n,i,j,k,max,min;
	int num[100];
	
	printf("\n Enter the total numbers : ");
	scanf("%d",&n);
	
	printf("\n Enter the number : ");
	for(i=0;i<n;i++)
	scanf("%d",&num[i]);
	
	printf("\n The array you entered is : ");
	for(i=0;i<n;i++)
	printf(" %d ," ,num[i]);
	
	max = num[0];
	min = num[0];
	for(j=1;j<n;j++)
	{
		if(max<num[j])
		max = num[j];
		if(min>num[j])
		min = num[j];
	}
	printf("\nmax is : %d , min is : %d ",max,min);
	
	return 0;
}
