import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dx = {0,0,-1,1}, dy = {1,-1,0,0};
        int[] dice = {0,0,0,0,0,0};
        int[] now = {2,3,1,4,0,5};
        int N = Integer.parseInt(st.nextToken())
                , M = Integer.parseInt(st.nextToken())
                , x = Integer.parseInt(st.nextToken())
                , y = Integer.parseInt(st.nextToken())
                , K = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(st.nextToken())-1;
            int nx = x+dx[n], ny = y+dy[n];
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            x= nx;
            y = ny;
            int[] next = new int[6];
            next[5] = now[n];
            if (n<2){
                next[4] = now[(n+1)%2];
                next[3] = now[3];
                next[2] = now[2];
                next[n] = now[4];
                next[(n+1)%2] = now[5];
            } else{
                next[4] = now[(n+1)%4==0?2:3];
                next[0] = now[0];
                next[1] = now[1];
                next[n] = now[4];
                next[(n+1)%4==0?2:3] = now[5];
            }
            now = next;
            if (map[x][y] == 0) {
                map[x][y] = dice[now[5]];
            }else{
                dice[now[5]] = map[x][y];
                map[x][y] = 0;
            }
            ans.append(dice[now[4]]+"\n");
        }
        System.out.println(ans);
    }

}