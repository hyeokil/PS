import java.io.*;
import java.util.*;


public class Main {
    static int a,b,c;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken())-1;
            if (a >= T) {
                ans = Math.min(a - T, ans);
            } else if (a+b*c>=T) {
                if (((T - a) % b) == 0) {
                    ans = 0;
                    break;
                } else {
                    ans = Math.min(b - ((T - a) % b), ans);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
