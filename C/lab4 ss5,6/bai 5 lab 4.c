#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
float T,B,H;
printf("nhap vao day lon hinh thang: ");
scanf("%f",&T);
printf("nhap vao day nho hinh thang: ");
scanf("%f",&B);
printf("nhap cao chieu cao hinh thang: ");
scanf("%f",&H);
printf("Dien tich hinh thang la : %.2f", (T+B)/2*H);

}
