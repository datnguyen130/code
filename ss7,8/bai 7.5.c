#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int mark;
	printf(" enter mark : ");
	scanf("%d",&mark);
	if (75<=mark && mark<=100)
		printf("grade = A");
	else if(60<=mark && mark<75)
		printf("grade = B");
	else if(45<=mark && mark<60)
		printf("grade = C");
	else if(35<=mark && mark<45)
		printf("grade = D");
	else if(0<=mark && mark<35)
		printf("grade = E");
	else 
		printf("nhap sai diem. nhap lai! ");
	return 0;
}
