#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int r;
	float P,S;
	printf(" nhap mot so bat ky :\n");
	scanf("%d", &r);
	P=2*r*3.14;
	S=r*r*3.14;
	printf(" chu vi hinh tron la : %f\n",P );
	printf("dien tich hinh tron la : %f\n",S);
	return 0;
}
