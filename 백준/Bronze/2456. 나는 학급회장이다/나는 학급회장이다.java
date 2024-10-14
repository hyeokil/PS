import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] res1 = new int[4];
        int[] total = new int[4];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 4; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                total[j] += tmp * tmp;
                res1[j] += tmp;
            }
        }
        int max = Math.max(Math.max(total[1], total[2]),total[3]);
        int res = 0,res2=0;
        for (int i = 1; i < 4; i++) {
            if (total[i] == max) {
                if (res == 0) {
                    res = i;
                } else {
                    res = 0;
                    break;
                }
            }
        }
        ans.append(res+" "+Math.max(Math.max(res1[1], res1[2]),res1[3]));
        System.out.println(ans);
    }
}