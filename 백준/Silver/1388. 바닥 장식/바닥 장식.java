import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;
    static boolean[][] visited;
    static char[][] arr;
    static byte N,M;
    static void dfs1(int x, int y) {
        visited[x][y] = true;
        if (y + 1 < M && arr[x][y + 1] == '-') {
            dfs1(x, y + 1);
        }
        return;
    }
    static void dfs2(int x, int y) {
        visited[x][y] = true;
        if (x + 1 < N && arr[x+1][y] == '|') {
            dfs2(x+1, y);
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        N = Byte.parseByte(st.nextToken());
        M = Byte.parseByte(st.nextToken());
        arr = new char[N][M];
        visited = new boolean[N][M];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) {
                    continue;
                }
                ans += 1;
                if (arr[i][j] == '-') {
                    dfs1(i, j);
                } else {
                    dfs2(i,j);
                }

            }
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }

}
