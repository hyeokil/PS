import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        long[] dp = new long[1000001];
        dp[1] = 1;dp[2]=2;dp[3]=4;
        for (int i = 4; i <= 1000000; i++) {
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
        }
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            ans.append(dp[N]+"\n");
        }

        System.out.println(ans);

    }
}
