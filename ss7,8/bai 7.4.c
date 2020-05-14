#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char grade;
	int allow,salary, sumsalary;
	printf("enter grade : ");
	scanf("%c",&grade);
	printf("enter salary : ");
	scanf("%d",&salary);
	if (grade=='A')
		allow = 300;
	else if (grade == 'B')
		allow = 250;
	else 
		allow = 100;
	sumsalary = salary + allow;
	printf("sum salry = %d", sumsalary);
		
	return 0;
}
