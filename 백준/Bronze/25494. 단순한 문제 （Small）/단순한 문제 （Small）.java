import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (T-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    ,b = Integer.parseInt(st.nextToken())
                    ,c = Integer.parseInt(st.nextToken());
            int res = 0;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    for (int k = 1; k <= c; k++) {
                        if (i % j == j % k && i % j == k % i) {
                            res++;
                        }
                    }
                }
            }
            ans.append(res+"\n");
        }
        System.out.println(ans);
    }
}
