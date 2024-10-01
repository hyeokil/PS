import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static long comb(int n, int r) {
        if (r == 0 || n == r) return 1;
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken())
                ,K = Integer.parseInt(st.nextToken());

        long totalCases = comb(N, M);

        long winningCases = 0;
        for (int i = K; i <= M; i++) {
            winningCases += comb(M, i) * comb(N - M, M - i);
        }
        
        double ans = (double) winningCases / totalCases;

        System.out.println(ans);

    }
}
