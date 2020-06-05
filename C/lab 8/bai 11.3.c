#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i,n,j=0,k,l;
	int x[100];
	int y[100];
	printf("Enter the total number you want : ");
	scanf("%d",&n);
	
	printf("Enter numbers : ");
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
 	for(j=0,i=n-1;j<n,i>=0;j++,i--)
 	y[j]= x[i];
 	
 	printf("Mang y la mang dao nguoc cua mang x, mang y la : ");
 	for(k=0;k<n;k++)
 	printf(" %d,",y[k]);
 	
 	
 	
 	
 	
	
	
	return 0;
}
