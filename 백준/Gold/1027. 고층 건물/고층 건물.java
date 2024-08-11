import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        int[] list = new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            double tmp =0;
            for (int j = i - 1; j >= 0; j--) {
                double gradient = (double) (list[i] - list[j]) /(i-j);
                if (j==i-1 || tmp > gradient) {
                    cnt++;
                    tmp = gradient;
                }
            }
            for (int j = i + 1; j < N; j++) {
                double gradient = (double) (list[j] - list[i]) /(j-i);
                if (j==i+1 || gradient > tmp) {
                    cnt++;
                    tmp = gradient;
                }

            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);


    }
}