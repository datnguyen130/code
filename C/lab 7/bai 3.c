#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int Asm,Pra,Wri;
	printf("\nNhap vao diem ASM : ");
	scanf("%d",&Asm);
	printf("\nNhap vao diem Practice : ");
	scanf("%d",&Pra);
	printf("\nNhap vao diem Written : ");
	scanf("%d",&Wri);
	if(Asm>0 && Asm <=10)
	{
		if(Asm>=4)
		printf("\nAsm Pass");
		else
		printf("\nAsm Fail");	
	} else printf("\nNhap lai diem Asm");
	
	if(Pra>0 && Pra <= 15)
	{
		if(Pra >= 6)
		printf("\nPractice Pass");
		else printf("\nPractice Fail");
	} else printf("\nNhap lai diem Practice");
	
	if(Wri>0 && Wri <=100)
	{
		if(Wri >= 40)
		printf("\nWritten Pass");
		else printf("\nWritten Fail");
	} else printf("\nNhap lai diem Written");
	return 0;
}
