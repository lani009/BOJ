package naverHackaton;

public class N2 {
    public static void main(String[] args) {
        System.out.println(solution("bab??a"));
    }

    public static String solution(String s) {
        int left = 0;
        int right = s.length() - 1;
        char strC[] = s.toCharArray();
        while(left < right) {
            char tempL = strC[left];
            char tempR = strC[right];
            if(tempL == '?' && tempR == '?') {
                strC[left] = 'z';
                strC[right] = 'z';
            }
            else if(tempL == '?') {
                strC[left] = strC[right];
            }
            else if(tempR == '?') {
                strC[right] = strC[left];
            }
            else if(tempL != tempR) {
                return "NO";
            }
            left++;
            right--;
        }
        return String.valueOf(strC);
    }
}