#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float r,hv,hcn1,hcn2;
	printf("nhap vao bn kinh hinh tron : ");
	scanf("%f",&r);
	printf("nhap vao canh hinh vuong : ");
	scanf("%f",&hv);
	printf("nhap vao hai canh hinh chu nhat : ");
	scanf("%f %f", &hcn1, &hcn2);
	printf("chu vi hinh tron la : %.2f", r*3.14*2);
	printf("\ndien tich hinh tron la : %.2f", r*r*3.14);
	printf("\nchu vi hinh vuong la : %.2f", 4*hv);
	printf("\ndien tich hinh vuong la : %.2f", hv*hv);
	printf("\nchu vi hinh chu nhat la : %.2f", 2*(hcn1+hcn2));
	printf("\ndien tich hinh vuong la : %.2f", hcn1*hcn2);
	
	return 0;
}
