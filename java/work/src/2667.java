import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Boj2667{
    static int N;
    static int map[][];
    static int k;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        String line;
        char strtok[];
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            strtok = line.toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(strtok[j]));
            }
        }
        int arr[] = checker();
        while(arr != null) {
            k++;
            dfs(arr[0], arr[1]);
            arr = checker();
        }
        int counter[] = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < N; j2++) {
                    if(map[j][j2] == i + 2)
                        counter[i] += 1;
                }
            }
        }
        Arrays.sort(counter);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(k) + '\n');
        for (int i : counter) {
            bw.write(Integer.toString(i) + '\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void dfs(int i, int j) {
        if(map[i][j] == k + 1)
            return;
        map[i][j] = k + 1;
        if(i + 1 < N && map[i + 1][j] != 0)
            dfs(i + 1, j);
        if(j + 1 < N && map[i][j + 1] != 0)
            dfs(i, j + 1);
        if(i - 1 >= 0 && map[i - 1][j] != 0)
            dfs(i - 1, j);
        if(j - 1 >= 0 && map[i][j - 1] != 0)
            dfs(i, j - 1);
    }
    public static int[] checker() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == 1){
                    int arr[] = {i , j};
                    return arr;
                }
            }
        }
        return null;
    }
}