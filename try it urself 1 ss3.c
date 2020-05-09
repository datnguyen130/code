#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int age;
	float salary;
	printf(" enter your age :\n");
	scanf("%d", &age);
	printf(" your age ofcourse is : %d\n", age);
	printf( "enter your salary :\n");
	scanf("%f",&salary);
	printf("your salary ofcourse is : %f\n", salary);
	return 0;
}
