package N2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class fdasfs{
    public static void main(String[] args)throws IOException {
        String input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        char[] inArr = input.toCharArray();
        char[] kmp = new char[55];
        kmp[0] = inArr[0];
        int index = 1;
        Character ch1;
        for (int i = 1; i < inArr.length; i++) {
            ch1 = inArr[i];
            if(ch1.equals('-')) {
                kmp[index++] = inArr[i + 1];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < index; i++) {
            bw.write(kmp[i]);
        }
        bw.flush();
        bw.close();
        br.close();

    }
}