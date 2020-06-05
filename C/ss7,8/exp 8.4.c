#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
float com,sale_amt;
char grade;
printf("enter the sale amount : ");
scanf("%f",&sale_amt);
fflush(stdin);
printf("\n enter the grade: ");
scanf("%c",&grade);
if(sale_amt > 10000)
	if (grade == 'A')
		com = sale_amt * 0.1;
	else 
		com = sale_amt * 0.08;
else 
	com = sale_amt * 0.05;
printf("\n commission : %f",com);

	return 0;
}
