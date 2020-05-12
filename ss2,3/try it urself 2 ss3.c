#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	double a = pow (4,4);
	printf("%lf\n",a);
	int b=23.34;
	printf("%d\n",b);
	int c=10,d;
	d=c + c++;
	printf("%d\n",d);
	int e=-5,g;
	g=-e;
	printf("%d\n",g);
	return 0;
}
