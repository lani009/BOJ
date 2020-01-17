import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class boj1920 {
    static int arrN[];
    static int N;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrN = new int[N];
        StringTokenizer strtok = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(strtok.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int arrM[] = new int[M];
        strtok = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(strtok.nextToken());
        }

        Arrays.sort(arrN);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            bw.write(Integer.toString(bSearch(arrM[i])) + '\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int bSearch(int num){
        int fir = 0;
        int last = N - 1;
        int mid;

        while (fir <= last){
            mid = (fir + last) / 2;
            if (arrN[mid] > num)
                last = mid - 1;
            else if (arrN[mid] < num)
                fir = mid + 1;
            else
                return 1;
        }
        return 0;
    }
}
