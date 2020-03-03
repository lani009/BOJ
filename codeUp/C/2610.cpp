#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void getArray(void);
void getLocation(void);
void fill(int a, int b);
void printArray();
bool alrCheck(int a, int b);
int map[10][10] = { NULL };
int location[2] = { NULL };
/*
location (x, y)
map[y][x]
*/
int main(void) {
	getArray();
	getLocation();
	if (alrCheck(location[1], location[0])) {
		printArray();
		return 0;
	}
	else {
		map[location[1]][location[0]] = 1;
	}
	fill(location[0], location[1]);
	printArray();
	return 0;
}
void printArray(void) {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if (map[i][j] == 0)
				printf("_");
			else
				printf("*");
		}
		printf("\n");
	}
}
bool alrCheck(int a, int b) {
	if (map[a][b] == 1)
		return true;
	else
		return false;
}
void getArray(void) {
	char temp[11];
	for (int i = 0; i < 10; i++) {
		scanf("%s", &temp);
		for (int j = 0; j < 10; j++) {
			if (temp[j] == '_')
				map[i][j] = 0;
			else
				map[i][j] = 1;
		}
	}
}

void getLocation(void) {
	scanf("%d %d", &location[0], &location[1]);
}

void fill(int a, int b) {	//x, y
	if (a + 1 < 10) {
		if (map[b][a + 1] == 0) {
			map[b][a + 1] = 1;
			fill(a+1,b);
		}
	}
	if (a - 1 >= 0) {
		if (map[b][a - 1] == 0) {
			map[b][a - 1] = 1;
			fill(a - 1, b);
		}
	}
	if (b + 1 < 10) {
		if (map[b + 1][a] == 0) {
			map[b + 1][a] = 1;
			fill(a, b + 1);
		}
	}
	if (b - 1 >= 0) {
		if (map[b - 1][a] == 0) {
			map[b - 1][a] = 1;
			fill(a, b - 1);
		}
	}
}