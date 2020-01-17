    #define _CRT_SECURE_NO_WARNINGS
    #include <stdio.h>
    #include <stdlib.h>

    int main(void) {
        int N;
        scanf("%d", &N);
        int arr[1000][2] = {NULL};
        for(int i = 0; i < N; i++){
            scanf("%d %d", &arr[i][0], &arr[i][1]);
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = 0;
            if(arr[i][0] == 1){
                sum += 500;
            }
            else if(arr[i][0] > 1 && arr[i][0] <= 3){
                sum += 300;
            }
            else if(arr[i][0] > 3 && arr[i][0] <= 6){
                sum += 200;
            }
            else if(arr[i][0] > 6 && arr[i][0] <= 10){
                sum += 100;
            }
            else if(arr[i][0] > 10 && arr[i][0] <=15){
                sum += 50;
            }
            else if(arr[i][0] > 15 && arr[i][0] <= 21){
                sum += 10;
            }
            if(arr[i][1] == 1)
                sum += 512;
            else if(arr[i][1] > 1 && arr[i][1] <= 3)
                sum += 256;
            else if(arr[i][1] > 3 && arr[i][1] <= 7)
                sum += 128;
            else if(arr[i][1] > 7 && arr[i][1] <= 15)
                sum += 64;
            else if(arr[i][1] > 15 && arr[i][1] <= 31)
                sum += 32;

            printf("%d", sum * 10000);
        }
        
        return 0;
    }

