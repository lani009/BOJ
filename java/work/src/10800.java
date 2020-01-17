import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class aaab{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        
        int arr[][] = new int[N][2];
        for(int i = 0; i < N; i++){
            s = br.readLine();
            StringTokenizer strtok = new StringTokenizer(s, " ");
            arr[i][0] = Integer.parseInt(strtok.nextToken());
            arr[i][1] = Integer.parseInt(strtok.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int score[] = new int[N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j!= i && arr[i][0] != arr[j][0] && arr[i][1] > arr[j][1]){
                    score[i] += arr[j][1];
                }
            }
            bw.write(score[i] + "\n");
            bw.flush();;
        }
        bw.close();

        

    }
}