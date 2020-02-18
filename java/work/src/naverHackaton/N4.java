package naverHackaton;

public class N4 {
    public static void main(String[] args) {
        System.out.println(solution(3, 7));
    }
    public static int solution(int A, int B) {
        int mul = A * B;
        String res = Integer.toBinaryString(mul);
        char resC[] = res.toCharArray();
        int cnt = 0;
        for (int i = 0; i < resC.length; i++) {
            char temp = resC[i];
            if(temp == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}