#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct high  {
	int id;
	char name[20];
	char group[20];
	int year;
};

int main( ) {
	struct high student[10];
	int i;
	int choice ;
	char addflag ;
	
	while(choice != 4)
	{
		fflush(stdin);
		printf("\n\nSelect from Menu \n\n1.Add student \n\n2.Search year sign \n\n3.Search ID  \n\n4.Exit\n \n\nEnter choice : ");
		scanf("%d",&choice);
		fflush(stdin);
		
		if (choice ==1)
		{
			addflag = 'y';
			for (i=0;i<10 && addflag == 'y';i++)
			{
				printf("\nEnter ID student : ");
				scanf("%d",&student[i].id);
				fflush(stdin);
				printf("\nEnter name student : ");
				gets(student[i].name);
				fflush(stdin);
				printf("\nEnter class sign in : ");
				gets(student[i].group);
				fflush(stdin);
				printf("\nEnter Year sign in : ");
				scanf("%d",&student[i].year);
				fflush(stdin);
				printf("\n Continue add student? (y/n) : ");
				scanf("%c",&addflag);
				
			}
		}
		else if(choice == 2)
		{	
			findyear (student);
		}
		else if(choice == 3)
		{
			findid(student);
		}
	}
	
	return 0;
}

findyear(struct high temp1[10])
{
	int tempyear;
	int i,j;
	char flag1 = 'y';
	for(;flag1 == 'y';)
	{
		printf("\nEnter year that you want to find : ");
		scanf("%d",&tempyear);
		fflush(stdin);
		
		for(i=0;i<10;i++)
		{
			if(tempyear == temp1[i].year)
			{
				printf("\n ID student : %d  , Name student : %s  ,  Class sign in : %s ",temp1[i].id,temp1[i].name,temp1[i].group);
			}
		}
		printf("\nContinue ? (y/n) : ");
		scanf("%c",&flag1);
	}
}
	
findid(struct high temp2[10])
{
	int tempid;
	int i,j;
	char flag2 = 'y';
	for(i=0;i<10 && flag2 =='y';i++ )
	{
		printf("\nEnter ID student that you want to find : ");
		scanf("%d",&tempid);
		fflush(stdin);
		if(tempid == temp2[i].id)
		{
		printf("\n ID student : %d  ,  Name student : %s   ,   class sign in : %s   , year sign in : %d", temp2[i].id,temp2[i].name,temp2[i].group,temp2[i].year);
		}	
		printf("\nContinue ? (y/n) : ");
		scanf("%c",&flag2);
	}
}

