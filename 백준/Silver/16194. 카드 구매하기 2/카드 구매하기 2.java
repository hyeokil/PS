import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N+1];
        Arrays.fill(list, Integer.MAX_VALUE);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (list[i] < n) continue;
            list[i] = n;
            for (int j = i + 1; j <= N; j++) list[j] = Math.min(list[i]+list[j-i], list[j]);
        }
        System.out.println(list[N]);
    }
}
