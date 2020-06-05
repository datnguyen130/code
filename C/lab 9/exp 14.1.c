#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	char *ptr;
	char word[10];
	int i,vow = 0;
	
	printf("\n Enter a word : ");
	gets(word);
	ptr = &word[0];
	
	for(i=0;i<strlen(word);i++)
	{
		if((*ptr=='a')||(*ptr=='e')||(*ptr=='i')||(*ptr=='o')||(*ptr=='u')||(*ptr=='A')||(*ptr=='E')||(*ptr=='I')||(*ptr=='O')||(*ptr=='U'))
		vow++;
		ptr++;
	}

	printf("\n The word is : %s \n The numbers of vowels in the word is : %d", word,vow);
	return 0;
}
