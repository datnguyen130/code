#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int masp;
	float thanhtien , rate;
	printf("\nnhap ma san pham : ");
	scanf("%d",&masp);
	printf("\nnhap thanh tien : ");
	scanf("%f",&thanhtien);
	
	if(masp==1){
		if(thanhtien>=500)
		rate=0.12;
		else if(thanhtien>=300)
		rate=0.08;
		else 
		rate=0.02;	
	}
	else if(masp==2){
		if(thanhtien>=2000)
		rate=0.1;
		else if(thanhtien>=1500)
		rate=0.05;
	}
	else if(masp==3){
		if(thanhtien>=5000)
		rate=0.1;
		else if(thanhtien>=2500)
		rate=0.05;
	}
	else 
	printf("\nBan khong duoc khau tru tien");
	printf("\nTien khau tru = %f", thanhtien * rate);
	return 0;
}
