#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int main() {
char x[20];
int i;
printf("\n Nhap vao mot chuoi bat ky : ");
gets(x);
printf("\n So cac ky tu co trong chuoi tren la : %d",strlen(x));
}
