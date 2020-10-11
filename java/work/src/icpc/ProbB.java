package icpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProbB {
    final static int DIV = 16769023;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int INPUT = Integer.parseInt(br.readLine());
        if (INPUT == 1) {
            bw.write("2");
            bw.flush();
            return;
        }
        int ans = 2;
        for(int i = 0; i < INPUT/2 - 1; i++) {
            ans *= 2;
            ans %= DIV;
        }
        if (INPUT % 2 != 0) {
            ans *= 2;
        }
        // if (INPUT%2 == 0) {
        //     // 짝
        //     ans = (long) Math.pow(2, INPUT/2);
        // } else {
        //     //홀
        //     ans = (long) Math.pow(2, INPUT/2) * 2;
        // }

        bw.write(Long.toString(ans%DIV));
        bw.flush();
    }
}