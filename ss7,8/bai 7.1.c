#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
float a,b,c;
printf("nhap so a : ");
scanf("%f",&a);
printf("nhap so b : ");
scanf("%f",&b);
c = fmod(a,b);
if (c==0)
	printf("a chia het cho b");
else 
	printf("a khong chia het cho b");
	return 0;
}
