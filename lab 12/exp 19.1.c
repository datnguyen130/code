#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main() {
	struct strucintcal {
		char name[20];
		int numb;
		float amt;	
	}xyz;
	
	float x;
	printf("\n Enter Customer name : ");
	gets(xyz.name);
	
	printf("\n Enter Customer number : ");
	scanf("%d",&xyz.numb);
	
	printf("\n Enter Principal Amount : ");
	scanf("%f",&xyz.amt);
	
	
}
void intcal( struct strucintal {
		char name[20];
		int numb;
		float amt;	
	}abc )
{
	float si, rate = 5.5, yrs = 2.5;
	
	si = (abc.amt * rate * yrs)/100;
	
	printf("\n The Customer name is %s",abc.name);
	printf("\n The Customer number is %d",abc.numb);
	printf("\n The amount is %f",abc.amt);
	printf("\n The interrest is %f",si);
}
