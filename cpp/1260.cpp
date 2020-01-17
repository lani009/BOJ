#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main(void){
    int N, M, V;
    scanf("%d %d %d", &N, &M, &V);

    int** mat = (int**)malloc(sizeof(int*) * N);
    int x, y;
    for(int i = 0; i < M; i++){
        *mat = (int*)malloc(sizeof(int) * N);
        scanf("%d %d", &x, &y);
        mat[y][x] = mat[x][y] = 1;
    }
}