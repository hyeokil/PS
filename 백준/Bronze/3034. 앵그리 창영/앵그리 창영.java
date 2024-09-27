import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(st.nextToken())
                , W = Integer.parseInt(st.nextToken())
                , H = Integer.parseInt(st.nextToken());
        double max = Math.sqrt(H * H + W * W);
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a <= max) {
                ans.append("DA\n");
            } else {
                ans.append("NE\n");
            }
        }
        System.out.println(ans);
    }
}
