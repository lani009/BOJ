#define _CRT_SEUCRE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(void){
    int N, Q;
    scanf("%d %d", &N, &Q);
    int** chkP  = (int**)malloc(sizeof(int*) * N);
    for(int i = 0; i < N; i++){
        *chkP = (int*)malloc(sizeof(int) * 2);
        scanf("%d %d", &chkP[i][0], &chkP[i][1]);
    }

    int** query = (int**)malloc(sizeof(int*) * Q);
    for(int i = 0; i < N; i++){
        *query = (int*)malloc(sizeof(int) * 3);
        scanf("%d %d", &query[i][0], &query[i][1]);
    }

    for(int i = 0; i < Q; i++){
        
    }

}