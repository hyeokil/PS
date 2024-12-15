import java.io.*;
import java.util.*;

public class Main {
    static int ans =Integer.MIN_VALUE;
    static int N,M,K;
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {-1,1,0,0}, dy = {0,0,1,-1};
    static void f(int k,int curV){
        if (k==K){
            ans = Math.max(ans,curV);
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j] != 0) continue;
                visited[i][j] += 1;
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d], ny = j + dy[d];
                    if (nx<0 || nx>=N || ny<0 || ny>=M) continue;
                    visited[nx][ny] +=1;
                }
                f(k+1,curV+arr[i][j]);
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d], ny = j + dy[d];
                    if (nx<0 || nx>=N || ny<0 || ny>=M) continue;
                    visited[nx][ny] -= 1;
                }
                visited[i][j] -=1;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        f(0,0);
        System.out.println(ans);
    }

}