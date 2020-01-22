package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        //data: a^b
        final int T = Integer.parseInt(reader.readLine());
        StringTokenizer strtok = null;
        for (int i = 0; i < T; i++) {
            strtok = new StringTokenizer(reader.readLine(), " ");
            int a = Integer.parseInt(strtok.nextToken());
            int b = Integer.parseInt(strtok.nextToken());
            int cnt = 1;
            for (int j = 0; j < b; j++) {
                cnt *= a;
                cnt %= 10;
            }
            cnt = (cnt == 0) ? 10 : cnt;
            print.write(Integer.toString(cnt) + "\n");
        }
        print.flush();
        print.close();
        reader.close();
    }
}