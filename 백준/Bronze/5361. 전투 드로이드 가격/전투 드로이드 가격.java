import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            double res=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            res+=Integer.parseInt(st.nextToken())*350.34;
            res+=Integer.parseInt(st.nextToken())*230.90;
            res+=Integer.parseInt(st.nextToken())*190.55;
            res+=Integer.parseInt(st.nextToken())*125.30;
            res+=Integer.parseInt(st.nextToken())*180.90;
            String res1 = String.format("%.2f", res);
            ans.append("$"+res1+"\n");
        }
        System.out.println(ans);

    }
}
