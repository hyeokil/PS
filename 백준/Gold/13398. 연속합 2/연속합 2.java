import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] dp = new int[N+1][2];
        int ans = dp[1][0] = dp[1][1] = Integer.parseInt(st.nextToken());
        for(int i=2;i<=N;i++){
            int n = Integer.parseInt(st.nextToken());
            dp[i][0] = Math.max(0, dp[i-1][0])+n;
            dp[i][1] = Math.max(dp[i-2][0], dp[i-1][1])+n;
            ans = Math.max(ans, Math.max(dp[i][0],dp[i][1]));
        }
        System.out.println(ans);
    }
}
