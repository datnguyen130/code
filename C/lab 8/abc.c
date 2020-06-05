#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n,i,j;
	char x[10][12];
	char temp[12];
	
	printf("\n Nhap vao cac strings ");
	printf("\n Nhap 'END' khi ket thuc");
	
	do 
	{
		printf("\n Dong thu %d la : ", n+1);
		scanf("%s",&x[n]);
	}while(strcmp(x[n++],"END"));
	
	n = n -1;
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(strcmp(x[i],x[j])>0)
			{
				strcpy(temp,x[i]);
				strcpy(x[i],x[j]);
				strcpy(x[j],temp);
			}
		}
	}
	
	for(i=0;i<n;i++)
	printf("\n Dong thu %d la : %s ",i+1,x[i]);
	return 0;
}
