#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int main() {
char name1[15] = "Sea View";
char name2[15] = " Sea Breeze";

printf("\n The old namae is %s",name1);

strcpy(name1,name2);
printf("\n The new name is %s ",name1);

}
