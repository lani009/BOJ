package N7000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(reader.readLine());
        int data[][] = new int[N][3];
        StringTokenizer strtok = null;
        for (int i = 0; i < N; i++) {
            strtok = new StringTokenizer(reader.readLine(), " ");
            data[i][0] = Integer.parseInt(strtok.nextToken());
            data[i][1] = Integer.parseInt(strtok.nextToken());
        }
        //고려사항
        //1. 나보다 덩치 작고 키도 작고.
        //2. 나보다 덩치 크고 키는 작고
        //3. 나보다 덩치 크고 키도 크고
        //4. 나보다 덩지 작고 키는 크고.
        for (int i = 0; i < N; i++) {
            data[i][2] = N;
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                if(data[i][0] > data[j][0] && data[i][1] < data[j][1])
                    data[i][2] -= 1;
                else if(data[i][0] < data[j][0] && data[i][1] > data[j][1])
                    data[i][2] -= 1;
                else if(data[i][0] > data[j][0] && data[i][1] > data[j][1]) {
                    data[i][2] -= 1;
                }
                // if(data[i][0] < data[j][0] && data[i][1] < data[j][1])
                //     data[i][2]++;
            }
        }
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            print.write(Integer.toString(data[i][2]) + " ");
        }
        print.flush();
        print.close();
        reader.close();
    }
}