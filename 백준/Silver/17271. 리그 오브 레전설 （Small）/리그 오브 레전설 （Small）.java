import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M=Integer.parseInt(st.nextToken());
        int[] dp = new int[N+1];
        dp[0] =1;
        for (int i =1 ; i <= N; i++) {
            if (i >= M) {
                dp[i]+=dp[i-M];    
            }
            dp[i] += dp[i - 1];
            dp[i]%=1000000007;
        }
        System.out.println(dp[N]);
    }
}

