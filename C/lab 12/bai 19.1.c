#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct system {
	int code;
	char name[20];
	float price;
	int quan;
};

int main( ) {
	int i;
	float sum = 0.0;
	struct system hand[5];
	
	for(i=0;i<5;i++)
	{
		printf("\n Ma san pham : %d ", i+1);
		hand[i].code = i+1;
		fflush(stdin);
		printf("\n Nhap vao ten san pham : ");
		gets(hand[i].name);
		fflush(stdin);
		printf("\n Nhap vao gia san pham : ");
		scanf("%f",&hand[i].price);
		fflush(stdin);
		printf("\n Nhap vao so luong san pham : ");
		scanf("%d",&hand[i].quan);
		fflush(stdin);
	}
	
	for(i=0;i<5;i++)
	{
		printf("\n San pham ma so %d co ten la %s co tong gia tri la %f ", hand[i].code, hand[i].name,hand[i].price*hand[i].quan);
		sum = sum + hand[i].price*hand[i].quan;
		
	}
	printf("\n Tong gia tri kho hang la : %f",sum);
	
	
	return 0;
}
