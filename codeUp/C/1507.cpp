#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int sqrVal[4][4] = { NULL };
	int sqr[100][100] = { NULL };
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			scanf("%d", &sqrVal[i][j]);
		}
	}

	for (int i = 0; i < 4; i++) {
		for (int j = sqrVal[i][0]; j < sqrVal[i][2]; j++) {
			for (int k = sqrVal[i][1]; k < sqrVal[i][3]; k++) {
				sqr[k][j] = 1;
			}
		}
	}

	int counter = 0;
	for (int i = 0; i < 100; i++) {
		for (int j = 0; j < 100; j++) {
			if (sqr[j][i] == 1) {
				counter++;
			}
		}
	}
	printf("%d", counter);
	return 0;
}