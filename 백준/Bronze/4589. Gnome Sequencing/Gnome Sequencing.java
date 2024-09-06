import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        ans.append("Gnomes:\n");
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean flag1=true,flag2=true;
            int tmp = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 2; i++) {
                int n = Integer.parseInt(st.nextToken());
                if (tmp < n) {
                    flag1=false;
                } else if (tmp > n) {
                    flag2 = false;
                } else {
                    flag1=true;
                    flag2=true;
                }
                tmp = n;
            }
            if (flag1 || flag2) {
                ans.append("Ordered");
            } else {
                ans.append("Unordered");
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}


