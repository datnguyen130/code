#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

main() {
int num1,num2;
scanf("%d%d", &num1,&num2);
printf(" so thu nhat la num1 = %d",num1);
printf("\n so thu hai la num2 = %d", num2);
printf("\n tong hai so la : %d", num1+num2);
printf("\n hieu hai so la : %d", num1 - num2);
printf("\n tich hai so la : %d", num1 * num2);
printf("\n thuong hai so la : %f", (float)num1/(float)num2 );
	return 0;
}
