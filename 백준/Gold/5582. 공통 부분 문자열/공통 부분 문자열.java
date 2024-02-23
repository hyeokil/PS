import java.io.*;
import java.util.*;

import static java.lang.Math.max;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S1 = br.readLine();
        String S2 = br.readLine();
        int L1 = S1.length();
        int L2 = S2.length();
        char[] C1 = new char[L1];
        char[] C2 = new char[L2];
        for (int i = 0; i < L1; i++) {
            C1[i] = S1.charAt(i);
        }
        for (int i = 0; i < L2; i++) {
            C2[i] = S2.charAt(i);
        }
        int ans = 0;
        int[][] dp = new int[L1 + 1][L2 + 1];
        for (int i = 1; i <= L1; i++) {
            for (int j = 1; j <= L2; j++) {
                if (C1[i - 1] == C2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = max(ans, dp[i][j]);
                }
            }
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
