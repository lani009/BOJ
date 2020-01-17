import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Boj4963{
    static int W, H, K;
    static int map[][];
    static int num;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            num = 0;
            strtok = new StringTokenizer(br.readLine(), " ");
            W = Integer.parseInt(strtok.nextToken());
            H = Integer.parseInt(strtok.nextToken());
            if(W == 0 && H == W)
                break;
            map = new int[H][W];
            for (int i = 0; i < H; i++) {
                strtok = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(strtok.nextToken());
                }
            }
            int arr[] = checker();
            while(arr != null) {
                num++;
                dfs(arr[0], arr[1]);
                arr = checker();
            }

            bw.write(Integer.toString(num) + '\n');
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void dfs(int i, int j) {
        if(map[i][j] == num + 1)
            return;
        map[i][j] = num + 1;
        if(i + 1 < H && map[i + 1][j] != 0)
            dfs(i + 1, j);
        if(j + 1 < W && map[i][j + 1] != 0)
            dfs(i, j + 1);
        if(i - 1 >= 0 && map[i - 1][j] != 0)
            dfs(i - 1, j);
        if(j - 1 >= 0 && map[i][j - 1] != 0)
            dfs(i, j - 1);
        if(i + 1 < H && j + 1 < W && map[i + 1][j + 1] != 0)
            dfs(i + 1, j + 1);
        if(i + 1 < H && j - 1 >= 0 && map[i + 1][j -1] != 0)
            dfs(i + 1, j - 1);
        if(i - 1 >= 0 && j + 1 < W && map[i - 1][j + 1] != 0)
            dfs(i - 1, j + 1);
        if(i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] != 0)
            dfs(i - 1, j - 1);
    }
    public static int[] checker() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(map[i][j] == 1){
                    int arr[] = {i , j};
                    return arr;
                }
            }
        }
        return null;
    }
}