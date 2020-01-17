import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1072 {
    public static void main(String[] args) throws IOException {
        // X: 게임 횟수, Y: 이긴 게임, Z: 승률(정수)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine(), " ");
        int x = Integer.parseInt(strtok.nextToken());
        int y = Integer.parseInt(strtok.nextToken());
        long z = (y * 100L) / x;

        BufferedWriter printer = new BufferedWriter(new OutputStreamWriter(System.out));
        if(z >= 99) {
            printer.write("-1");
            return;
        }

        int left = 0;
        int right = 1000000000;
        int mid = 0;
        long temp = 0;
        int result = -1;
        while(left <= right) {
            mid = (left + right) / 2;
            long ym = (long)(y + mid);
            long xm = (long)x + mid;
            temp = (100L * ym / xm);
            if(z >= temp) {
                left = mid + 1;
                result = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        printer.write(Integer.toString(result));
        printer.flush();
        printer.close();
        reader.close();
    }
}