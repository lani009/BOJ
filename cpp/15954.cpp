#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>

double stdDvi(int arr[], int fir, const int K);

int main(void){
    int N, K;
    scanf("%d %d", &N, &K);
    int arr[500] = {NULL};
    
    for(int i = 0; i < N; i++){
        scanf("%d", &arr[i]);
    }
    
    double min = stdDvi(arr, 0, K);
    double temp;
    for(int i = 0; i < N - K + 1; i++){
        for(int j = K; j < N - i + 1; j++){
            temp = stdDvi(arr, i, j);
            if(min > temp)
                min = temp;
        }
    }
    printf("%.11lf", min);
    return 0;
}

double stdDvi(int arr[], int fir, const int K){
    int sigma = 0;
    for(int i = fir; i < fir + K; i++){
        sigma += arr[i];
    }
    double avg = (double)sigma / K;
    double div = 0;
    for(int i = fir; i < fir + K; i++){
        div += pow(arr[i]-avg, 2);
    }
    return sqrt(div / K);
}