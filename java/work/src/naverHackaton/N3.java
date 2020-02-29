package naverHackaton;

public class N3 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < A.length; i++) {
            //(01)*
            if(i%2 != A[i]) {
                cnt1++;
            }
            //(10)*
            if((i+1)%2 != A[i]) {
                cnt2++;
            }
        }
        return (cnt1 < cnt2) ? cnt1 : cnt2;
    }
}