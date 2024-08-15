import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),X = Integer.parseInt(st.nextToken());
        long[] amplitude = new long[N];
        long sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            amplitude[i] = Long.parseLong(st.nextToken());
            sum += amplitude[i]*amplitude[i];
        }
        
        if (X == 0) {
            for (int i = 0; i < N; i++) {
                ans.append(0).append(" ");
            }
        } else {
            double k = Math.sqrt((double) X*N / sum);

            for (int i = 0; i < N; i++) {
                if (amplitude[i] == 0) {
                    ans.append(0).append(" ");
                } else {
                    ans.append(amplitude[i] * k).append(" ");
                }
            }
        }
        System.out.println(ans);

    }
}