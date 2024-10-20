import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken())
                , B = Integer.parseInt(st.nextToken())
                , C = Integer.parseInt(st.nextToken())
                , D = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int res = 0;
            int  n = Integer.parseInt(st.nextToken());
            int m1 = n%(A+B),m2 = n%(C+D);
            if (m1<=A && m1!=0) res++;
            if (m2<=C && m2!=0) res++;
            ans.append(res+"\n");
        }
        System.out.println(ans);
    }
}
