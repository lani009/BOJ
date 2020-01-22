package N2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj2798 {
    static ArrayList<int[]> cardSet = new ArrayList<int[]>();
    static int max = 0;
    static int card[];
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtok = new StringTokenizer(reader.readLine(), " ");
        final int N = Integer.parseInt(strtok.nextToken());
        M = Integer.parseInt(strtok.nextToken());
        card = new int[N];
        strtok = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < card.length; i++) {
            card[i] = Integer.parseInt(strtok.nextToken());
        }
        int arr[] = new int[N];
        combination(arr, 0, N, 3, 0);
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        print.write(Integer.toString(max));
        print.flush();
        print.close();
        reader.close();
    }

    public static void combination(int[] arr, int index, int n, int r, int target) {
        if(r == 0) {
            int cnt = 0;
            for (int i = 0; i < index; i++) {
                cnt += card[arr[i]];
            }
            if(cnt > max && cnt <= M) {
                max = cnt;
            }
        }
		else if(target == n) return;
		else {
			arr[index] = target;
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
    }
    public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
        // r ==0 이란 것은 뽑을 원소를 다 뽑았다는 뜻.
        if(r == 0){
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += card[arr[i]];
            }
            if(cnt > max && cnt <= M) {
                max = cnt;
            }
        //끝까지 다 검사한 경우..1개를 뽑은 상태여도 실패한 경우임 무조건 return 으로 종료
        }else if(target == n){ 
             
            return;
         
        }else{
            combArr[index] = target;
            // (i) 뽑는 경우 
            // 뽑으니까, r-1
            // 뽑았으니 다음 index + 1 해줘야 함
            doCombination(combArr, n, r-1, index+1, target+1, arr);
             
            //(ii) 안 뽑는경우
            // 안뽑으니까 그대로 r
            // 안뽑았으니, index는 그대로!
            // index를 그대로하면, 예를 들어 현재 1번 구슬을 comArr에 넣엇어도 다음 재귀에 다시 엎어쳐서 결국 1구슬을 뽑지 않게 된다.
            doCombination(combArr, n, r, index, target+1, arr); 
        }
    }
}