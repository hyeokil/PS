import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }
            ans.append("Case #"+i+": "+max+"\n");
        }
        System.out.println(ans);
    }
}
