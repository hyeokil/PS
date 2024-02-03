import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long dp0 = 0L, dp1 = 1L;
        for (int i = 2; i <= N; i++) {
            long tmp = dp0 + dp1;
            dp0 = dp1;
            dp1 = tmp;
        }
        bw.write(Long.toString(dp1));
        bw.close();
    }
}
