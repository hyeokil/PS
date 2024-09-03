import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static boolean[][] visited;
    static char[][] arr;
    static int[] dx = {0, 0, -1, 1},dy = {1, -1, 0, 0};
    static boolean flag = false;
    static void dfs(int x,int y, int ex,int ey){
        for (int i=0;i<4;i++){
            int nx=x+dx[i], ny=y+dy[i];
            if (nx<0 || nx>=N || ny<0 || ny>=M ) continue;
            if (nx==ex && ny==ey) continue;
            if (arr[x][y] == arr[nx][ny]) {
                if (visited[nx][ny]) {
                    flag = true;
                    return;
                }
                visited[nx][ny] = true;
                dfs(nx,ny,x,y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());M= Integer.parseInt(st.nextToken()) ;
        visited = new boolean[N][M];
        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) continue;
                if (flag) break;
                dfs(i,j,-1,-1);
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


