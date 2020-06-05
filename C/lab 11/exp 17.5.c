#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int main() {
int *loc;
char str1[15] = "Ha Noi";
char str2[15] = "Da Nang";
char chr = 'o';
loc = strchr(str1,chr);
if(loc != NULL)
printf("\n%c co trong %s",chr,str1);
else printf("\n%c khong co trong %s",chr,str1);

loc = strchr(str2,chr);
if(loc != NULL)
printf("\n%c co trong %s",chr,str2);
else printf("\n%c khong co trong %s",chr,str2);
	
}
