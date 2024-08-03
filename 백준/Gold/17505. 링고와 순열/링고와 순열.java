import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),s=0,e=N-1;
        long K = Long.parseLong(st.nextToken());
        int[] ans = new int[N];
        for (int i = N; i>=1; i--) {
            if (K >= (i - 1)) {
                K -= (i - 1);
                ans[s] = i;
                s += 1;
            } else {
                ans[e] = i;
                e -= 1;
            }
        }
        System.out.println(Arrays.toString(ans).replace("[","").replace("]","").replaceAll(",",""));


    }
}
