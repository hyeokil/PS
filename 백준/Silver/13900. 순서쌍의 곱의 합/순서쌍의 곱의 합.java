import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long ans = 0;
        long tmp = Long.parseLong(st.nextToken());
        for (int i = 0; i < N-1; i++) {
            int a = Integer.parseInt(st.nextToken());
            ans += a * tmp;
            tmp += a;
        }
        System.out.println(ans);

    }
}
