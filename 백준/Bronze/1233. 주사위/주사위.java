import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());
        int[] lst = new int[S1 + S2 + S3+1];
        int mx = 0;
        int ans = 0;
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    lst[i + j + k] += 1;
                    if (mx < lst[i + j + k]) {
                        mx = lst[i + j + k];
                        ans = i + j + k;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
