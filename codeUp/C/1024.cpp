#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char text[100] = { NULL };
	scanf("%s", text);
	int i = 0;
	while (text[i] != '\0') {
		printf("\'%c\'\n", text[i]);
		i++;
	}
	return 0;
}