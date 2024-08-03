import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),s=0,e=N-1;
        long K = Long.parseLong(st.nextToken());
        int[] ans = new int[N];
        for (int i = N; i>=1; i--) {
            if (K >= (i - 1)) {
                K -= (i - 1);
                ans[s] = i;
                s++;
            } else {
                ans[e] = i;
                e--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : ans) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

    }
}
