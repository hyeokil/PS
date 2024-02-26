import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static StringTokenizer st;

    static int mid,cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] drink = new int[N];
        for (int i = 0; i < N; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }
        int s = 1;
        int e = Arrays.stream(drink).max().getAsInt();
        if (K == 1) {
            bw.write(Integer.toString(e));
        } else {
            while (s < e) {
                mid = (s + e) / 2;
                cnt=0;
                for (int dr : drink) {
                    cnt+=dr/mid;
                }
                if (cnt >= K) {
                    s = mid + 1;
                } else {
                    e = mid;
                }
            }
            bw.write(Integer.toString(s-1));
        }
        bw.close();
    }
}
