package N3000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input[] = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        int result[] = new int[42];
        for (int i = 0; i < input.length; i++) {
            result[input[i] % 42] = 1;
        }
        int cnt = 0;
        for (int i = 0; i < result.length; i++) {
            if(result[i] == 1) {
                cnt++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}