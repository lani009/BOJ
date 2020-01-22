import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner k = new Scanner(System.in);
        k.next();
        for(int i = 0; i < 10000; i++) {
            bw.write(Integer.toString(i) + '\n');
            bw.flush();
        }
        
        bw.close();
        k.close();
        
    }
}