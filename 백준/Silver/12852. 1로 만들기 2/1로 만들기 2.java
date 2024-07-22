import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[N] = 0;
        q.add(N);
        while (!q.isEmpty()) {
            int n = q.remove();
            if (n == 1) break;
            if (n < 1) continue;
            if (n % 3 == 0 && dp[n/3]>dp[n]+1) {
                dp[n / 3] = dp[n] + 1;
                q.add(n / 3);
            }
            if (n % 2 == 0 && dp[n / 2] > dp[n] + 1) {
                dp[n / 2] = dp[n] + 1;
                q.add(n / 2);
            }
            if (dp[n - 1] > dp[n] + 1) {
                dp[n - 1] = dp[n] + 1;
                q.add(n - 1);
            }
        }
        ans.append(dp[1]+"\n");
        int a = 1;
        String S = "1";
        while (true) {
            if (a == N) break;
            if (a*3<=N && dp[a * 3] == dp[a] - 1) {
                a *= 3;
            } else if (a*2<=N&&dp[a * 2] == dp[a] - 1) {
                a *= 2;
            } else if (a+1<=N && dp[a + 1] == dp[a] - 1) {
                a += 1;
            }
            S= a+" "+S;
        }
        ans.append(S);
        System.out.println(ans);
    }
}
