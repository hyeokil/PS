import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        byte N = Byte.parseByte(br.readLine());
        byte[] L = new byte[N];
        byte[] J = new byte[N];
        int[] dp = new int[100];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {L[i] = Byte.parseByte(st.nextToken());}
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {J[i] = Byte.parseByte(st.nextToken());}
        for (int i = 0; i < N; i++) {
            for (int j = 99; j >= L[i]; j--) {
                if (j > L[i]) {
                    if (dp[j - L[i]] != 0) {
                        dp[j] = Math.max(dp[j], dp[j - L[i]] + J[i]);
                    }
                } else {
                    dp[j] = Math.max(dp[j], dp[j - L[i]] + J[i]);
                }
            }

        }
        bw.write(Integer.toString(Arrays.stream(dp).max().getAsInt()));
        bw.close();
    }
}
