import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        int s=0;
        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int[] check = new int[10];
        int cnt = 0 ;
        for (int e=0;e < N; e++) {
            check[list[e]]++;
            if (check[list[e]] == 1) {
                cnt++;
            }
            while (cnt > 2) {
                check[list[s]]--;
                if (check[list[s]] == 0) {
                    cnt--;
                }
                s++;
            }
            ans = Math.max(ans, e-s+1);
        }
        System.out.println(ans);
    }
}
