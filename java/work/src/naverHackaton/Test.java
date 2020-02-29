package naverHackaton;

import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int a[] = {1,2,3};

        System.out.println(solution(a));
    }
    public static int solution(int A[]) {
        Arrays.sort(A);
        int memo = 0;
        if(A[A.length-1] <= 0) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] <= 0) {
                continue;
            }
            else if(A[i] > 1) {
                return 1;
            }
            else {
                memo = i;
                break;
            }
        }
        int num = 1;
        for (int i = memo + 1; i < A.length; i++) {
            if(A[i-1] == A[i]) {
                continue;
            }
            else if(A[i] == num + 1) {
                num++;
                continue;
            }
            else if(num + 1 < A[i]) {
                return num + 1;
            }
            num++;
        }
        return A[A.length - 1] + 1;
    }
}