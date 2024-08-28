import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken())
                    ,X = Integer.parseInt(st.nextToken())
                    ,Y = Integer.parseInt(st.nextToken());
            int max = Integer.MIN_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N-1; i++) {
                max = Math.max(max,Integer.parseInt(st.nextToken()));
            }
            int A = Integer.parseInt(st.nextToken());
            if (max < A) {
                ans.append(0+"\n");
                continue;
            }
            double tmp = (double) X/ max;
            int s = 0,e=Y+1;
            while (s<e) {
                int mid = (s+e)/2;
                if (tmp <= (double) (X - mid) / A+1) {
                    s = mid+1 ;
                } else {
                    e = mid ;
                }
            }
            if (s>Y) s = -1;
            ans.append(s).append("\n");
        }
        System.out.println(ans);
    }
}
