#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


void main() {
	int i,j,arr[5] = { 23,90,9,25,16};
	char flag;
	for(i=1;i<5;i++)
	{
		for (j=0,flag='n';j<i && flag == 'n';j++)
		{
			if(arr[j]>arr[i])
			{
				insertnum(arr,i,j);
				flag = 'y';
			}
		}
	}
	printf("\n\n The sorted array\n");
	for(i=0;i<5;i++)
	printf("%d\t",arr[i]);
}
insertnum(int arrnum[],int x,int y)
{
	int temp;
	temp = arrnum[x];
	for(;x> y;x--)
	arrnum[x] = arrnum[x-1];
	arrnum[x] = temp;
}









