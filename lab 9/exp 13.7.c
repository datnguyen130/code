#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main() {
	int *a,i,n,sum=0;
	
	printf("\n%s%s", "An array will be created dynamically. \n\n",
	"Input an array size n of followed by interger : ");
	
	scanf("%d",&n);
	
	a = (int*) calloc (n,sizeof(int));
	
	for(i= 0; i <n ; i ++)
	{
		printf("Enter %d value : ",n);
		scanf("%d", a+i);
	}	
	
	for(i=0;i<n;i++)
	sum +=*(a+i);
	free(a);
	printf("\n%s%7d\n%s%7d\n\n","Number of elements : ", n, "Sum of the elements : ", sum);

}
