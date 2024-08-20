import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , W = Integer.parseInt(st.nextToken())
                , H = Integer.parseInt(st.nextToken())
                , L = Integer.parseInt(st.nextToken());
        int ans = (W/L)*(H/L);
        System.out.println(Math.min(ans,N));
    }
}
