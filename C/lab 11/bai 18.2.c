#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	float max_temp(float temp1[5] );
	float min_temp(float temp2[5]);
	float temp[5][5] ;
	int i,j;
	printf("\n Nhap nhiet do trung binh trong nam lan luot cua cac thanh pho Ha Noi, Sai Gon, Da Nang, Sapa, Hoi An");
	for (i =0;i<5;i++)
	{	
		printf("\n Nhap nhiet do tai vi tri temp[%d] : ",i);
		for(j=0;j<5;j++)
		scanf("%f", *(temp+i)+j );
		fflush(stdin);
		
	}

	printf("\n Nhiet do cao nhat va thap nhat trong 5 nam lien tiep cua Ha Noi lan luot la : %.1f , %.1f", max_temp(temp[0]), min_temp(temp[0]));
	printf("\n Nhiet do cao nhat va thap nhat trong 5 nam lien tiep cua Sai Gon lan luot la : %.1f , %.1f", max_temp(temp[1]), min_temp(temp[1]));
	printf("\n Nhiet do cao nhat va thap nhat trong 5 nam lien tiep cua Da Nang lan luot la : %.1f , %.1f", max_temp(temp[2]), min_temp(temp[2]));
	printf("\n Nhiet do cao nhat va thap nhat trong 5 nam lien tiep cua Sa Pa lan luot la : %.1f , %.1f", max_temp(temp[3]), min_temp(temp[3]));
	printf("\n Nhiet do cao nhat va thap nhat trong 5 nam lien tiep cua Hoi An lan luot la : %.1f , %.1f", max_temp(temp[4]), min_temp(temp[4]));


}
float max_temp(float temp1[5])
{
	int i;
	float max = temp1[0];
	for(i=1;i<5;i++)
	{
		if(max<temp1[i])
		{
			max = temp1[i];
		}
		
	}
	return(max);
}
float min_temp(float temp2[5])
{
	int x;
	float min = temp2[0];
	for(x=1;x<5;x++)
	{
		if(min>temp2[x])
		{
			min = temp2[x];
		}
		
	}
	return(min);
}
