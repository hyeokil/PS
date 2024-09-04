import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int[] prefix = new int[N+1];
        long ans = 0 ;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            prefix[i+1] = list[i]+prefix[i];
        }
        for (int i = 0; i < N; i++) {
            ans += (long)list[i]*(prefix[N]-prefix[i+1]);
        }
        System.out.println(ans);
    }
}


