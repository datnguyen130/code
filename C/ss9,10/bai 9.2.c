#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a1,a2,sum = 0,i;
	printf("Nhap vao hai so : ");
	scanf("%d%d",&a1,&a2);
	for( i = a1 +1 ;i < a2; i++)
	{
		if(i % 2 == 0) continue;
		sum = sum + i;
	}
	if (sum == 0)
	printf("\nkhong co so le");
	else printf("%d",sum);
	
	return 0;
}
