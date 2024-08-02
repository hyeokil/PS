import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int[] prefix = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            prefix[i+1] = prefix[i]+list[i];
        }
        int ans = 0;
        for (int i = 1; i < N; i++) {
            ans = Math.max(ans,prefix[N]-list[0]-list[i]+prefix[N]-prefix[i+1]);
            ans = Math.max(ans,prefix[i+1]-list[0]+prefix[N]-prefix[i]-list[N-1]);
            ans = Math.max(ans,prefix[N-1]-list[N-1-i]+prefix[N-i-1]);
        }
        System.out.println(ans);


    }
}
