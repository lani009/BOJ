package N1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        String temp = br.readLine();
        StringTokenizer strtok = new StringTokenizer(temp, " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strtok.nextToken());
        }
        int map[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j)
                    continue;
                if(isPrime(arr[i] + arr[j])) {
                    map[i][j] = map[j][i] = 1;
                }
            }
        }
        
    }
    public static boolean isPrime(int num) {
        if(num == 1)
            return true;
        else if(num % 2 == 0)
            return false;
        for (int i = 3; i < num / 2 + 1; i+=2) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}