#define _CRT_SECURE_NO_WARNINGS
#define DATAMAX 1024
#include <stdio.h>
#include <stdlib.h>

void combination(int arr[], int index, int n, int r, int target, int pure[]);
int sumArr(int a, int b);
int combNum(int a, int b);

int dataSet[DATAMAX][10] = { NULL };
int counter = 0;
int main(void)
{
	//init all variable
	int mana;
	scanf("%d", &mana);

	int card;
	scanf("%d", &card);

	int* set = (int*)malloc(sizeof(int*) * card);
	int* pure = (int*)malloc(sizeof(int*) * card);

	for (int i = 0; i < card; i++) {
		scanf("%d", &set[i]);
	}
	for (int i = 1; i <= card; i++) {
		combination(set, 0, card, i, 0, pure);	//집합, 0, 개수, 조합개수, 0, 새로운
		for (int j = 0; j < card; j++) {
			pure[j] = 0;
		}
	}
	int index[DATAMAX] = { NULL };
	int index_sum[DATAMAX] = { NULL };
	int index_i[DATAMAX] = { NULL };
	int countArr = 0;
	//int temp_i = 0;
	int upBlock = 0;
	//int temp_countArr;
	for (int i = 1; i <= card; i++) {
		int endC = combNum(card, i);
		for (int j = 0; j < endC; j++) {
			int sum = sumArr(countArr, i);
			if (sum <= mana) {
				index[upBlock] = countArr;
				index_sum[upBlock] = sum;
				index_i[upBlock] = i;
				upBlock++;
				/*for (int k = 0; k < i; k++) {
					printf("%d ", dataSet[countArr][k]);
				}
				printf("\n");*/
			}
			countArr++;
		}
	}
	//5 2 , 0 10  -> 0
	int max = -1;
	int checker = -1;
	for (int i = 0; i < upBlock; i++) {
		if (index_sum[upBlock - i - 1] > max) {
			max = index_sum[upBlock - i - 1];
			checker = upBlock - i - 1;
		}
	}
	if (checker < 0) {
		printf("-1");
		return 0;
	}
	for (int i = 0; i < index_i[checker]; i++) {

		printf("%d ", dataSet[index[checker]][i]);
	}
	return 0;

	//for (int i = 0; i < 50; i++) {
	//	for (int j = 0; j < 10; j++) {
	//		printf("%d ", dataSet[i][j]);
	//	}
	//	printf("\n");
	//}
}

int sumArr(int a, int b) {
	int sum = 0;
	for (int i = 0; i < b; i++) {
		sum += dataSet[a][i];
	}
	return sum;
}
void combination(int arr[], int index, int n, int r, int target, int pure[]) {
	if (r == 0) {
		for (int i = 0; i < index; i++) {
			dataSet[counter][i] = arr[pure[i]];
		}
		counter++;
	}
	else if (target == n)
		return;
	else {
		pure[index] = target;
		combination(arr, index + 1, n, r - 1, target + 1, pure);
		combination(arr, index, n, r, target + 1, pure);
	}
}

int combNum(int a, int b) {
	int i, j, n = 1, r = 1;

	for (i = a; i >= a - b + 1; i--)
		n = n * i;

	for (j = b; j >= 1; j--)
		r = r * j;
	
	return(n / r);
}