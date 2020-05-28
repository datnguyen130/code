#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct date{
	int day;
	int month;
	int year
};
struct company {
	int id;
	char name[20];
	float salary;
	struct date dt;
};

int main() {
	int i,j,n = 0;
	struct company employ[10];
	char addflag;
	int choice ;
	
	while ( choice != 4)
	{
		printf("\n\nChon trong MENU : \n\n1.Nhap thong tin nhan vien \n\n2.Truy xuat tong luong \n\n3.Truy xuat nhan vien tren 10 nam \n\nLua chon : ");
		scanf("%d",&choice);
		fflush(stdin);
		
		if(choice == 1)
		{	n++;
			addflag = 'y';
			for(i=0;i<10 && addflag=='y';i++)
			{
				printf("\nNhap ma nhan vien : ");
				scanf("%d",&employ[i].id);
				fflush(stdin);
				printf("\nNhap ten nhan vien : ");
				gets(employ[i].name);
				fflush(stdin);
				printf("\nNhap luong cua nhan vien : ");
				scanf("%f",&employ[i].salary);
				fflush(stdin);
				printf("\nNhap ngay vao lam : ");
				scanf("%d %d %d",&employ[i].dt.day,&employ[i].dt.month,&employ[i].dt.year);
				fflush(stdin);
				printf("\nTiep tuc nhap thong tin nhan vien ? (y/n) : ");
				scanf("%c",&addflag);
				fflush(stdin);
				
			}
		}
		else if(choice == 2)
		{
			incre (employ);
		}
		else if(choice == 3)
		{
			find (employ,n);
		}
			
	}	
	
	return 0;
}

incre (struct company temp1[10] )
{
	int i,j,n;
	for(i=0;i<10;)
	for(i=0;i<10;i++)
	{
		if(temp1[i].salary <= 2000 )
		{
			temp1[i].salary *= 1.15;
		}
		else if(temp1[i].salary >2000 && temp1[i].salary <=5000)
		{
			temp1[i].salary *= 1.1;
		}
		printf("\n Nhan vien ma so ID %d co luong thuc linh la %f",temp1[i].id,temp1[i].salary);
		fflush(stdin);

	}
}
find (struct company temp2[10],int n2)
{	
	int i;
	printf("\n\nNam nay la nam 2020 \n\nDanh sach cac nhan vien co kinh nghiem tu 10 nam tro len : ");
	fflush(stdin);
	for(i=0;i<n2 ;i++)
	{	
		if(temp2[i].dt.year <= 2010 )
		{
		printf("\n\n Nhan vien ma ID : %d co ten : %s vao lam cong ty nam %d",temp2[i].id,temp2[i].name,temp2[i].dt.year);
		}
		
	}
	fflush(stdin);
}









