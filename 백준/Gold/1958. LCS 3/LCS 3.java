import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S1 = br.readLine().toCharArray();
        char[] S2 = br.readLine().toCharArray();
        char[] S3 = br.readLine().toCharArray();
        int[][][] dp = new int[S1.length+1][S2.length+1][S3.length+1];
        for (int i = 1; i <= S1.length; i++) {
            for (int j = 1; j <= S2.length; j++) {
                for (int k = 1; k <= S3.length; k++) {
                    if (S1[i-1]==S2[j-1]&&S2[j-1]==S3[k-1]) {
                        dp[i][j][k]=dp[i-1][j-1][k-1]+1;
                    } else {
                        dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
                    }
                }
            }
        }
        System.out.println(dp[S1.length][S2.length][S3.length]);
    }
}

