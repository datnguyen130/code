#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int ary1[3][3],ary2[3][3],ary3[3][3];
	int i,j;
	
	printf("\nNhap gia tri cua cac phan tu trong ar1,ary2 \n");
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\nNhap gia tri tai vi tri [%d][%d] cua ary1, ary2 :",i,j);
			scanf("%d %d",(*(ary1+i) + j),(*(ary2+i)+j));
			*(*(ary3+i)+j) = *(*(ary1+i)+j) +*(*(ary2 + i) +j);
		}
	}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			printf("\n ary1[%d][%d] la : %d", i,j,*(*(ary3 +i) +j));
		}
	return 0;
}
