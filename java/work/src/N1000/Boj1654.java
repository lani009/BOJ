package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1654 {
    static int K;
    static long have[];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine(), " ");
        K = Integer.parseInt(strtok.nextToken());
        final int N = Integer.parseInt(strtok.nextToken());
        long max = 0;
        have = new long[K];
        for (int i = 0; i < have.length; i++) {
            have[i] = Long.parseLong(reader.readLine());
            if(have[i] > max)
                max = have[i];
        }
        long left = 1;
        long right = max;
        long mid = 0;
        long ans = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            long cables = cableCounter(mid);
            if(cables >= N) {
                left = mid + 1;
                ans = mid;
            }
            else {
                right = mid - 1;
            }
        }
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        print.write(Long.toString(ans));
        print.flush();
        print.close();
        reader.close();        
    }
    public static long cableCounter(long mid) {
        long count = 0;
        for (int i = 0; i < have.length; i++) {
            count += have[i] / mid;
        }
        return count;
    }
}