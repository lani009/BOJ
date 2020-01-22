package codility;

public class BinaryGap {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(64));
    }
}
class Solution {
    public int solution(int N) {
        int[] bit = new int[32];
        int k = 0;
        while(N != 0) {
            bit[k] = N % 2;
            N /= 2;
            k++;
        }

        int bitCount = 0;
        int[] binary = new int[k];
        for (int i = 0; i < k; i++) {
            if(bit[i] == 1) {
                binary[bitCount++] = i;
            }
        }
        if(bitCount == 1)
            return 0;
        int max = 0;
        for (int i = 0; i < bitCount - 1; i++) {
            int temp = binary[i+1] - binary[i];
            if(temp > max)
                max = temp;
        }
        return max - 1;
    }
}