import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken())
                , W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] height = new int[W];
        int ans =0;
        for (int i=0; i<W; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=1; i<W-1; i++) {
            int l = 0;
            int r  =0;
            for (int j = 0; j < i; j++) {
                l = Math.max(l, height[j]);
            }
            for (int j=i+1; j<W; j++) {
                r = Math.max(r, height[j]);
            }
            if (height[i] <l && height[i] < r) {
                ans+=Math.min(l,r)-height[i];
            }
        }

        System.out.println(ans);
    }
}
