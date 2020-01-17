import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Scanner;
class Maain {
    static int map[][];
    static boolean visited[];
    static int N, M, V;
    public static void main(String[] args) throws InputMismatchException{
        Scanner key = new Scanner(System.in);

        N = key.nextInt();
        M = key.nextInt();
        V = key.nextInt();

        map = new int[N + 1][N + 1];
        int x, y;
        visited = new boolean[N + 1];

        for(int i = 0; i < M; i++){
            x = key.nextInt();
            y = key.nextInt();
            map[x][y] = map[y][x] = 1;
        }
        dfs(V);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(V);
    }

    public static void dfs(int i){
        visited[i] = true;
        System.out.print(i+" ");
        for(int j =1; j<N+1; j++){
            if(map[i][j] == 1 && visited[j]==false){
                dfs(j); // 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면, 다시 리커해서 돌아오는 방식임.
            }
        }
    }

    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true; //방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요.
        while(!q.isEmpty()){
            int temp = q.poll(); //첫번째 방문한 위치는 빼주기로 한다.
            System.out.print(temp+" ");
            for(int k =1; k<=N; k++){
                if(map[temp][k]==1 && visited[k]==false){
                    q.offer(k);
                    visited[k] = true; //true라면 방문을 한거임. ㅇㅇ
                }
            }
        }
    }


}