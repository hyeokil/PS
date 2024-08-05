import java.io.*;
import java.util.*;


public class Main {
    static boolean flag = false;
    static int N,x=1;
    static int[][] arr;
    static boolean[][] visited;
    static void dfs(int i, int j) {
        if (flag) {
            return;
        }
        if (arr[i][j] == -1) {
            flag = true;
            return;
        }
        int ni = i+arr[i][j];
        int nj = j+arr[i][j];
        if (ni >= 0 && ni < N && !visited[ni][j]) {
            visited[ni][j] = true;
            dfs(ni,j);
        }
        if (nj >= 0 && nj < N && !visited[i][nj]) {
            visited[i][nj] = true;
            dfs(i,nj);
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr=new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] S = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(S[j]);
            }
        }
        dfs(0, 0);
        if (flag) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }




    }
}
