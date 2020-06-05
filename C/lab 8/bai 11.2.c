#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,n,j,k,h = 0;
	int x[100];
	printf("Enter the total number you want : ");
	scanf("%d",&n);
	
	printf("Enter numbers : ");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	printf("The text is :");
	for(j=0;j<n;j++)
	printf(" %d,",x[j]);
	
	for(k=0;k<n;k++)
	{
		if(x[k]>0) continue;
		h++;
	}
	printf("\nSo cac so nguyen am la : %d",h);
	return 0;
}
