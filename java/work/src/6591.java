import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class sjkdfl{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer strtok;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            input  = br.readLine();
            strtok = new StringTokenizer(input, " ");
            int n = Integer.parseInt(strtok.nextToken());
            int r = Integer.parseInt(strtok.nextToken());
            if(n == 0 && r == 0)
                break;
            bw.write(Integer.toString(comb(n, r)) + '\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
    public static int comb(int n, int r){
        if(r == 0){
            return 1;
        }
        else if(r == 1){
            return n;
        }
        else if(n == r){
            return 1;
        }
        return comb(n - 1, r - 1) + comb(n - 1, r);
    }
}