import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String s = i+"";
            for (char c:s.toCharArray()) {
                if (c == '3' || c=='6'||c=='9') {
                    ans++;
                }
            }

        }

        System.out.println(ans);

    }
}
