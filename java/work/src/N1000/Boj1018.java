package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtok = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(strtok.nextToken());
        int b= Integer.parseInt(strtok.nextToken());
        String map[][] = new String[a][b];
        for (int i = 0; i < a; i++) {
                map[i] = br.readLine().split("");
        }

        int temp = -1;  //1: B, 0: W
        int min = 64;
        for (int i = 0; i < a - 7; i++) {
            for (int j = 0; j < b - 7; j++) {
                int cnt1 = 0;
                int cnt2 = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if(map[k][l].equals("B"))
                            temp = 1;
                        else
                            temp = 0;
                        if((k + l) % 2 != temp)
                            cnt1++;
                        if((k + l + 1) % 2 != temp)
                            cnt2++;
                    }
                }
                min = (min > cnt1) ? cnt1 : min;
                min = (min > cnt2) ? cnt2 : min;
            }
        }

        bw.write(Integer.toString(min));
        bw.flush();
        bw.close();
        br.close();
    }
}