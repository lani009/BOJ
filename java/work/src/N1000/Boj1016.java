package N1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj1016 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer strtok = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(strtok.nextToken());
        int max = Integer.parseInt(strtok.nextToken());

        int sqrtMin = (int)Math.ceil(Math.sqrt(min));
        int sqrtMax = (int)Math.floor(Math.sqrt(max));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf((max - min + 1) - (sqrtMax - sqrtMin + 1)));

        bw.flush();
        bw.close();
        br.close();
    }
}