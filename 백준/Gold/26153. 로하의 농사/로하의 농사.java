import java.io.*;
import java.util.*;

public class Main {
    static int N,M,ans;
    static int[][] arr;
    static int[] dx = {0, 0, 1, -1},dy = {1, -1, 0, 0};
    static boolean[][] visited ;
    static void dfs(int X, int Y, int xx,int yy, int P, int V) {
        if (P == 0) {
            ans = Math.max(ans, V);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = X + dx[i];
            int ny = Y + dy[i];
            if (dx[i] == xx && dy[i] == yy) {
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && P>0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dfs(nx, ny, dx[i], dy[i], P-1, V + arr[X][Y]);
                    visited[nx][ny] = false;
                } else {
                    ans = Math.max(ans, V + arr[X][Y]);
                }
            } else {
                if (dx[i]+xx ==0 && dy[i]+yy ==0) {
                    continue;
                }
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && P > 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dfs(nx, ny, dx[i], dy[i], P - 2, V + arr[X][Y]);
                    visited[nx][ny] = false;
                } else {
                    ans = Math.max(ans, V + arr[X][Y]);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int X= Integer.parseInt(st.nextToken())
                ,Y= Integer.parseInt(st.nextToken())
                ,P = Integer.parseInt(st.nextToken());
        ans =arr[X][Y];
        visited = new boolean[N][M];
        visited[X][Y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = X + dx[i];
            int ny = Y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M ) {
                visited[nx][ny] = true;
                dfs(nx,ny,dx[i],dy[i],P,arr[X][Y]);
                visited[nx][ny] = false;
            }
        }

        System.out.println(ans);

    }
}