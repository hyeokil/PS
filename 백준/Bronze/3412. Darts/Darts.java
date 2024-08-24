import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int[] radi = {400,1600,3600,6400,10000,14400,140*140,160*160,180*180,40000};
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int res = 0 ;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()),b = Integer.parseInt(st.nextToken());
                int tmp = a*a+b*b;
                for (int j = 0; j < 10; j++) {
                    if (radi[j] >= tmp) {
                        res+=10-j;
                        break;
                    }
                }

            }
            ans.append(res+"\n");
        }
        System.out.println(ans);
    }
}
