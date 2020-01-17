#define _CRT_SECURE_NO_WARNINGS
#define K 6
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct PRD_ {
	char country1[10];
	char country2[10];
	double w;
	double d;
	double l;
} prd;
int t[4][2] = {NULL};
int s[4] = {NULL};
int finder(char country[]);

char country[4][10] = { NULL };
void sort()
void dfs(int n, double p, prd prid[]){

}
int main(void) {
	prd prid[K];

	scanf("%s %s %s %s", country[0], country[1], country[2], country[3]);
	for (int i = 0; i < K; i++) {
		scanf("%s %s %lf %lf %lf", &prid[i].country1, &prid[i].country2, &prid[i].w, &prid[i].d, &prid[i].l);
	}
	double score[4] = { NULL };
	for (int i = 0; i < K; i++) {
		score[finder(prid[i].country1)] += prid[i].w * 3 + prid[i].d * 1;
		score[finder(prid[i].country2)] += prid[i].l * 3 + prid[i].d * 1;
	}
	for (int i = 0; i < 4; i++) {
		printf("%lf\n", score[i]);
	}
	double ans[4] = {NULL};
	

}

int finder(char countryCmp[]) {
	for (int i = 0; i < 4; i++) {
		if (!strcmp(countryCmp, country[i])) {
			return i;
		}
	}
}