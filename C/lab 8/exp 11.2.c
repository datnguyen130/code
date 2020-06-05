#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int ary[10];
	int i,total = 0,high;
	for(i=0;i<10;i++)
	{
		printf(" Enter value : %d : ",i+1);
		scanf("%d",&ary[i]);	
	}
	high = ary [0];
	for(i=1;i<10;i++)
	{
		if ( ary[i] > ary[0] )
		high = ary[i];
	}
	printf("highest number is : %d",high);
	for(i=0;i<10;i++)
	{
		total += ary[i];
	}
	printf("\n average is : %d", total/i);
	return 0;
}
