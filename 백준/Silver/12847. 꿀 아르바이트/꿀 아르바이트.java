import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken());
        long[] pay = new long[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            pay[i] = Long.parseLong(st.nextToken())+pay[i-1];
        }
        for (int i = M; i <= N; i++) {
            ans = Math.max(ans, pay[i]-pay[i-M]);
        }
        System.out.println(ans);
    }
}
