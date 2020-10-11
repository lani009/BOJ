package icpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ProbC {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtok = new StringTokenizer(br.readLine(), " ");
        final int N = Integer.parseInt(strtok.nextToken());
        final int W = Integer.parseInt(strtok.nextToken());

        final int chart[] = new int[N];

        for (int i = 0; i < chart.length; i++) {
            chart[i] = Integer.parseInt(br.readLine());
        }
        int balanceCash = W;
        int balanceCoin = 0;
        boolean have = false;
        for (int i = 0; i < chart.length - 1; i++) {
            if (chart[i] < chart[i+1] && !have) {
                // 살 타이밍
                balanceCoin = balanceCash / chart[i];
                balanceCash -= balanceCoin * chart[i];
                have = true;
                //System.out.println("삼: "+Integer.toString(chart[i]));
            } else if (chart[i] > chart[i+1] && have) {
                // 팔 타이밍
                balanceCash += balanceCoin * chart[i];
                balanceCoin = 0;
                have = false;
                //System.out.println("팜: "+Integer.toString(chart[i]));

            }
        }
        if (have) {
            balanceCash += balanceCoin * chart[chart.length-1];
        }

        bw.write(Integer.toString(balanceCash));
        bw.flush();
    }
}
