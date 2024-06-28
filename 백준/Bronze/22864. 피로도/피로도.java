import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int time = 0, p = 0, ans = 0;
        while(time < 24) {
            if(p + A <= M) {
                ans += B;
                p += A;
            }
            else {
                p = Math.max(0,p-C);
            }
            time++;
        }
        System.out.print(ans);
    }
}

