import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int tmp = 0;
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (i == 1) {
                dp[i] = n;
            } else if (i == 2) {
                dp[i] = dp[i - 1] + n;
            } else {
                dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + n, dp[i - 3] + tmp + n));
            }
            tmp = n;
        }
        System.out.println(dp[N]);
        }

    }
