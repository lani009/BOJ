#include <stdio.h>
int main(void) {
    int n;
    scanf("%d", &n);
    
    for(int i = 0; i < 9; i++) {
        for(int j = 0; j < (i+1)*n; j++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}