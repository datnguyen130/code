#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void main(int argc, char *argv[]) {
	static int ary[10]={1,2,3,4,5,6,7,8,9,10};
	int i;
	for ( i=0;i<10;i++)
	printf("\n i = %d, ary[i] = %d, *(ary+i) = %d, &ary[i] = %u, ary+i = %u",i,ary[i],*(ary+i),&ary[i],ary+i);
	return 0;
}
