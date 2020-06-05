#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct book_st
{
	int book_cd;
	char book_nm[30];
	char author[30];
	int copies;
};

struct date_st
{
	int month;
	int day;
	int year;
};

struct tran_st
{
	int book_code;
	char tran_type;
	struct date_st tran_dt
};

int main() {
	int choice = 1 , i;
	char addflag;
	struct book_st books[5];
	struct tran_st trans[10];
	while(choice == 1 || choice ==2 || choice == 3)
	{
		printf("\nSelect from Menu\n 1. Add book name\n 2. Record Issue/Return\n 3. Sort Transaction\n 4. Exit\n\n Enter Choice : ");
		scanf("%d",&choice);
		fflush(stdin);
		if(choice == 1)
		{
			addflag = 'y';
			for(i=0;i<5 &&addflag =='y';i++)
			{
				books[i].book_cd=i+1;
				printf("\n\n Book code : %d \n\n Book name : ",i+1);
				scanf("%s",books[i].book_nm);
				printf("\nAuthor : ");
				scanf("%s",books[i].author);
				printf("\nNumber of copies : ");
				scanf("%d",&books[i].copies);
				fflush(stdin);
				printf("\n\n Continue ? (y/n) : ");
				scanf("%c",&addflag);
				
			}
	
		}
		else if(choice == 2)
		{
			addflag = 'y';
			for(i=0;i<10 && addflag =='y';i++)
			{
				printf("\n\nBook code : ");
				scanf("%d",&trans[i].book_code);
				fflush(stdin);
				printf("\nIssue or Return ? (i / r) : ");
				scanf("%c",&trans[i].tran_type);
				printf("\nDate : ");
				fflush(stdin);
				scanf("%d %d %d", &trans[i].tran_dt.month,&trans[i].tran_dt.day,&trans[i].tran_dt.year);
				printf("\\Contine? (y/n) : ");
				fflush(stdin);
				scanf("%c", &addflag);
			}
		
		}
		else if(choice==3)
		{
			sorttran(trans);
		
		
		}
		
	}
	return(0);
}
	sorttran ( struct tran_st tran[10])
	{
		int i,j,tempcode;
		struct tran_st temptran;
		for(i=0;i<10;i++)
		{
			for(j = i+1;j<10;j++)
			{
				if(tran[i].book_code > tran[j].book_code)
				{
					temptran = tran[i];
					tran[i] = tran[j];
					tran[j] = temptran;
				}
			}
		}
		
		for(i=0,j=0;i<10;j=0)
		{
			tempcode=tran[i].book_code;
			while(tran[i].book_code == tempcode && i<10 )
			{
				j++;
				i++;
			 } 
			printf("\nBook code %d had %d transactions ", tempcode,j);
		}
		
	}

