package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        int num = 666;
        int cnt = 0;
        while(cnt < N) {
            int temp = num;
            while(temp != 0) {
                if(temp % 1000 == 666) {
                    cnt++;
                    break;
                }
                temp /= 10;
            }
            num++;            
        }
        bw.write(Integer.toString(num - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}