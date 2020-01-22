import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj17224 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine());
        final int N = Integer.parseInt(strtok.nextToken()); //문제의 개수
        final int L = Integer.parseInt(strtok.nextToken()); //역량
        final int K = Integer.parseInt(strtok.nextToken()); //최대 문제의 개수

        int problem[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            strtok = new StringTokenizer(reader.readLine());
            problem[i][0] = Integer.parseInt(strtok.nextToken());
            problem[i][1] = Integer.parseInt(strtok.nextToken());
        }
        int count_easy = 0;
        int count_hard = 0;
        for (int i = 0; i < N; i++) {
            if(problem[i][0] <= L) {
                count_easy++;
            }
            if(problem[i][1] <= L)
                count_hard++;
        }
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        if(count_hard >= K) {
            print.write(Integer.toString(K * 140));
        }
        else if(K - count_hard > count_easy - count_hard) {
            //남은문제 > 쉬운문제 남은 것
            print.write(Integer.toString(count_hard * 140 + (count_easy - count_hard) * 100));
        }
        else {
            print.write(Integer.toString(count_hard * 140 + (K - count_hard) * 100));
        }

        print.flush();
        print.close();
        reader.close();
    }
}