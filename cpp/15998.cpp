#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main(void){
    int N;
    scanf("%d", &N);
    int** arr;
    arr = (int**)malloc(sizeof(int*) * N);
    for(int i = 0; i < N; i++){
        arr[i] = (int*)malloc(sizeof(int) * 2);
    }

    for(int i = 0; i < N; i++){
        scanf("%d %d", )
    }
}