import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        int[] dp = new int[1001];
        dp[1] = 3;
        for (int i = 2; i <= 1000; i++) {
            int cnt=0;
            for (int j=1; j <= i; j++) {
                if (i == j) continue;
                if (gcd(i, j) == 1) {
                    cnt+=2;
                }
            }
            dp[i] = dp[i-1]+cnt;
        }
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            ans.append(dp[N] + "\n");
        }
        System.out.println(ans);
    }
}


