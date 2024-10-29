import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),S = Integer.parseInt(st.nextToken()),
        M = Integer.parseInt(st.nextToken());
        boolean[][] dp = new boolean[N+1][M+1];
        dp[0][S] = true;
        st = new StringTokenizer(br.readLine());
        int input;
        for (int i=1;i<=N;i++){
            input = Integer.parseInt(st.nextToken());
            for (int j=0;j<=M;j++) {
                if (dp[i-1][j]){
                    if (j-input>=0) dp[i][j-input]=true;
                    if (j+input<=M) dp[i][j+input]=true;
                }
            }
        }
        for (int i=0;i<=M;i++){
            if (dp[N][i]) ans = i;
        }
        System.out.println(ans);
    }
}
