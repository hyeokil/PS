import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node {
        int v,c, d;

        Node(int v, int c, int d) {
            this.v = v;
            this.c = c;
            this.d = d;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            ArrayList<Node>[] nodes = new ArrayList[N+1];
            for (int i = 0; i <= N; i++) {
                nodes[i] = new ArrayList<>();
            }
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                nodes[u].add(new Node(v,c,d));
            }
            int[][] dp = new int[N + 1][M + 1];
            for (int i = 0; i <= N; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }
            dp[1][0] = 0;
            for (int cost = 0; cost <= M; cost++) {
                for (int now = 1; now < N; now++) {
                    if (dp[now][cost] != Integer.MAX_VALUE) {
                        for (Node node : nodes[now]) {
                            int curC = cost + node.c;
                            int curD = dp[now][cost] + node.d;
                            if (curC > M) {
                                continue;
                            }
                            if (dp[node.v][curC] > curD) {
                                dp[node.v][curC] = curD;
                            }
                        }
                    }
                }
            }
            int ans = Integer.MAX_VALUE;
            for (int cost = 0; cost <= M; cost++) {
                ans = Math.min(ans, dp[N][cost]);
            }
            if (ans == Integer.MAX_VALUE) {
                System.out.println("Poor KCM");
            } else {
                System.out.println(ans);
            }
        }
    }
}