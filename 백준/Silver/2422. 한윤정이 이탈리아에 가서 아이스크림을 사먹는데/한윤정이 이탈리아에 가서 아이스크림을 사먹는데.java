import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , M = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[N+1][N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    , b = Integer.parseInt(st.nextToken());
            visited[a][b] = true;
            visited[b][a] = true;
        }
        for (int i =1; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (visited[i][j]) continue;
                for (int k = j+1; k <= N; k++) {
                    if (visited[i][k] || visited[j][k]) continue;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}