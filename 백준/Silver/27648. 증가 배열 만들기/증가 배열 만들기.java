import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        if (N + M - 1 > K) {
            sb.append("NO");
        } else {
            sb.append("YES\n");
            for (int i = 1; i <= N; i++) {
                for (int j = i; j < M+i; j++) {
                    String tmp = " ";
                    if (j==M+i){tmp="";}
                    sb.append(j).append(tmp);
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
}
