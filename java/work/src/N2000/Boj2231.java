package N2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(reader.readLine());
        int construc = 0;
        for (int i = 1; i < N; i++) {
            int cnt = i;
            int num = i;
            while(num != 0) {
                cnt += num % 10;
                num /= 10;
            }
            if(cnt == N) {
                construc = i;
                break;
            }
        }
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        print.write(Integer.toString(construc));
        print.flush();
        print.close();
        reader.close();
    }
}