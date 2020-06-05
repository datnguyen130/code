#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int money = 0,sum=0;
	char i,ans;
	printf ("\nWould you like : ....");
	printf("\nMenu: ");
	printf("\nCoffe	\tNhap so 1 \t10$");
	printf("\nCoca \t\tNhap so 2 \t20$");
	printf("\nWater \t\tNhap so 3 \t5$");
	do 
	{	
		printf("\nWould you like : ");
		do{
			i= getchar();
			switch (i){
				case '1':
					printf("Ban chon Coffe");
					money = 10;
					sum+=money;
					break;
				case '2':
					printf("Ban chon Coca");
					money = 20;
					sum+=money;
					break;
				case '3':
					printf("Ban chon Water");
					money = 5;
					sum+=money;
					break;
				 }
		
			
		}while(i != '\n');
		printf("\nThe anwser is : ");
		ans = getchar();
		fflush(stdin);
		printf("it's cost : %d", money);
			
			
	}while(ans == 'y' || ans == 'Y');
	
	sum = sum - money;
	printf("\nTong so tien la : %d", sum);
	return 0;
}
