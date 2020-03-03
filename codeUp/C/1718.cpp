#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(void) {
	char text[8] = { NULL };
	char textX[4] = { NULL };
	char textY[4] = { NULL };
	scanf("%s", text);
	int i = 1;
	int j = 0;
	int count = 0;	//글 개수
	while (text[count] != NULL) {
		count++;
	}
	while (text[i] != 'H') {
		textX[j] = text[i];
		i++;
		j++;	//C에 계수가 없으면 j=0, 계수가 있으면 숫자 개수만큼
	}
	i++;    //인덱스를 H뒤의 숫자로 포커싱
	int k = 0;
	while (text[i] != NULL) {
		textY[k] = text[i];
		i++;
		k++;
	}
	int x;
	int y;
	if (textX[0] == NULL)
		x = 1;
	else
		x = atoi(textX);

	if (textY[0] == NULL)
		y = 1;
	else
		y = atoi(textY);


	printf("%d", x * 12 + y);
	return 0;
}