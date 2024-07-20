import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken()),M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {break;}
            int[] arr = new int[N];
            int max = 0;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[j] += Integer.parseInt(st.nextToken());
                    max = Math.max(max, arr[j]);
                }
            }
            ans.append(max+"\n");
        }
        System.out.println(ans);

    }
}
