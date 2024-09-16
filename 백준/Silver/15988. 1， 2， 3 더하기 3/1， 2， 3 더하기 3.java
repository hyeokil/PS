import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        long[] dp = new long[1000001];
        dp[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            long a=dp[i-1],b=0,c=0;
            if (i>1) b = dp[i - 2];
            if (i>2) c = dp[i - 3];
            dp[i] = (a+b+c)%1000000009;
        }
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            ans.append(dp[N]+"\n");
        }

        System.out.println(ans);

    }
}
