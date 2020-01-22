import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj17225 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine(), " ");

        final int A = Integer.parseInt(strtok.nextToken()); //상민이 포장시간
        final int B = Integer.parseInt(strtok.nextToken()); //지수 포장시간
        final int N = Integer.parseInt(strtok.nextToken()); //어제 상민이 손님 수

        int guest[][] = new int[N][3];
        //시간, 색깔, 주문 개수
        //색깔이 B일 경우 0, R일 경우 1

        String temp;
        int blueCount = 0;
        int redCount = 0;
        int blueIndex[] = new int[5000];
        int redIndex[] = new int[5000];
        for (int i = 0; i < N; i++) {
            strtok = new StringTokenizer(reader.readLine());
            guest[i][0] = Integer.parseInt(strtok.nextToken());
            temp = strtok.nextToken();
            if(temp.equals("B")) {
                guest[i][1] = 0;
                blueIndex[blueCount++] = i;
            }
            else {
                guest[i][1] = 1;
                redIndex[redCount++] = i;
            }
            guest[i][2] = Integer.parseInt(strtok.nextToken());
        }
        
        ArrayList<int[]> list = new ArrayList<int[]>(1000);
        for (int i = 0; i < blueCount; i++) {
            for (int j = 0; j < guest[blueIndex[i]][2]; j++) {
                int saver[] = new int[2];
                //if(guest[blueIndex[i]][0] * A + guest[blueIndex[i-1]][0] < )
                saver[0] = 0;
                saver[1] = guest[blueIndex[i]][0] + j * A;
                list.add(saver);
            }
        }
        for (int i = 0; i < redCount; i++) {
            for (int j = 0; j < guest[redIndex[i]][2]; j++) {
                int saver[] = new int[2];
                saver[0] = 1;
                saver[1] = guest[redIndex[i]][0] + j * B;
                list.add(saver);
            }
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if(s1[1] > s2[1])
                    return 1;
                else if(s1[1] < s2[1])
                    return -1;
                else if(s1[0] < s2[0])
                    return 1;
                return 0;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d %d\n", list.get(i)[0], list.get(i)[1]);
        }
    }
}