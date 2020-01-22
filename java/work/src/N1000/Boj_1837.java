package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine());
        char[] P = strtok.nextToken().toCharArray();
        int K = Integer.parseInt(strtok.nextToken());
        int p = findPair(P, K);
        
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        if(p == -1)
            print.write("GOOD");
        else {
            print.write("BAD " + Integer.toString(p));
        }
        print.flush();
        print.close();
        reader.close();
    }

    public static int findPair(char[] P, long K) {
        int memo = -1;
        for (int i = 3; i < K; i++) {
            if(isPrime(i) && mod(P, i) == 0) {
                return i;
            }
        }
        return memo;
    }
    
    public static int mod(char S[], int p)
    {
        // S는 수를 문자열로 표현한 것, 1324 -> "1324"
        int ret = 0;
        for (int i=0; S[i] != 0; i++) {
            ret = (ret*10 + (S[i]-'0')) % p;
            if(i >= S.length - 1)
                break;
        }
        return ret;
    }

    public static boolean isPrime(long num) {
        if(num % 2L == 0)
            return false;
        else {
            for (long i = 3L; i < num/2+1;) {
                if(num % i == 0)
                    return false;
                i += 2;
            }
        }
        return true;
    }
}