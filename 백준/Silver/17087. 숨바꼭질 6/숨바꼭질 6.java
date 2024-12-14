import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , S = Integer.parseInt(st.nextToken());
        int[] A  = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        ans = Math.abs(S-A[0]);
        for (int i = 1; i < N; i++) ans = gcd(ans,Math.abs(S-A[i]));
        System.out.println(ans);
    }

}