#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int taikhoan,pin,money = 0,x = 0;money = 1000;
	char ans = 'y';
	printf("Nhap so tai khoan : ");
	scanf("%d",&taikhoan);
	printf("Nhap mat khau : ");
	scanf("%d",&pin);
	if (taikhoan == 123 && pin == 124)
	{
		printf("\nMoi ban rut tien");
		printf("\nTrong tai khoan cua ban con : %d $",money);
		do
		{
			printf("\nSo tien ban can rut : ");
			scanf("%d",&x);
			fflush(stdin);
			if(money >= x){
				
				money-=x;
				printf("So tien con lai la : %d", money);
				printf("\nBan muon rut tien nua khong? (Y/N): ");
				scanf("%c",&ans);
				fflush(stdin);}
				
			else{
				printf("\nYou don't have enough money honey!");
				printf("\nBan muon rut tien nua khong? (Y/N) : ");
				scanf("%c",&ans);
				fflush(stdin);
			}

		}while(ans == 'y' || ans =='Y');
	}
	return 0;
}
