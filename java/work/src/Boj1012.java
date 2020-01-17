import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1012{
    static BufferedReader reader;
    static StringTokenizer strtok;
    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(reader.readLine());
        int output[] = new int[T];
        for (int i = 0; i < T; i++) {
            String temp = reader.readLine();
            strtok = new StringTokenizer(temp, " ");
            final int M = Integer.parseInt(strtok.nextToken());
            final int N = Integer.parseInt(strtok.nextToken());
            final int K = Integer.parseInt(strtok.nextToken());
            output[i] = tCase(M, N, K);
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            writer.write(Integer.toString(output[i]));
            writer.newLine();
        }
        writer.flush();
        writer.close();
        reader.close();
    }

    public static int tCase(final int M, final int N, final int K) throws IOException {
        //M: 가로길이, N: 세로길이, K: 배추의 개수
        int map[][] = new int[N][M];
        for (int i = 0; i < K; i++) {
            String temp = reader.readLine();
            strtok = new StringTokenizer(temp, " ");
            int x = Integer.parseInt(strtok.nextToken());
            int y = Integer.parseInt(strtok.nextToken());
            map[y][x] = 1;
        }
        int location[];
        int num = 0;
        while((location = checker(map, M, N)) != null) {
            dfs(map, M, N, location[0], location[1], ++num);
        }
        return num;
    }

    public static void dfs(int[][] map, int M, int N, int x, int y, int num){
        if(map[y][x] == (num + 1))
            return;
        map[y][x] = num + 1;
        if(x + 1 < M && map[y][x + 1] != 0)
            dfs(map, M, N, x + 1, y, num);
        if(y + 1 < N && map[y + 1][x] != 0)
            dfs(map, M, N, x, y + 1, num);
        if(x - 1 >= 0 && map[y][x - 1] != 0)
            dfs(map, M, N, x - 1, y, num);
        if(y - 1 >= 0 && map[y - 1][x] != 0)
            dfs(map, M, N, x, y - 1, num);
    }

    public static int[] checker(int[][] map, int M, int N) {
        //x, y 형태로 반환
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 1) {
                    int arr[] = {j, i};
                    return arr;
                }
            }
        }
        return null;
    }
}