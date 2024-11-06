import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
        ,T = Integer.parseInt(st.nextToken())
        ,C = Integer.parseInt(st.nextToken())
        ,P = Integer.parseInt(st.nextToken());
        int ans = ((N-1)/T)*C*P;
        System.out.println(ans);
    }
}
