#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char ten[100];
	int tuoi,i;
	printf("nhap ten : ");
	scanf("%s",&ten);
	fflush(stdin);
	printf("nhap tuoi :");
	scanf("%d",&tuoi);
	for(i=1;i<=tuoi;i++)
		{
		printf("\n%s",ten);
		}
	
	return 0;
}
