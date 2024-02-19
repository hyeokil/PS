import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> q = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            q.add(Long.parseLong(st.nextToken()));
        }
        for (int i = 0; i < M; i++) {
            Long a = q.poll();
            Long b = q.poll();
            q.add(a + b);
            q.add(a + b);
        }
        StringBuilder sb = new StringBuilder();
        Long ans = 0L;
        for (int i = 0; i < N; i++) {
            ans += q.poll();
        }
        sb.append(ans);
        System.out.println(sb);
    }
}