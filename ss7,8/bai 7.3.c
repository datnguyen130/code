#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	printf("nhap vao so a : ");
	scanf("%d",&a);
	printf("nhap vao so b : ");
	scanf("%d",&b);
	c=a-b;
	if(c==a)
		printf("hieu bang gia tri cua a la : %d",a);
	else if (c==b)
		printf("hieu bang gia tri cua b la : %d",b);
	else 
		printf("hieu khong bang gia tri nao nhap vao");

	return 0;
}
