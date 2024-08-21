import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , M = Integer.parseInt(st.nextToken())
                , K = Integer.parseInt(st.nextToken());
        int ans = Math.min(M,K)+Math.min(N-M,N-K);
        System.out.println(ans);
    }
}
