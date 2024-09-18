import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 1;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((o1, o2) -> o1[0]-o2[0]);
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            pq1.offer(new int[] {Integer.parseInt(s[1]), Integer.parseInt(s[2])});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        while (!pq1.isEmpty()) {
            int[] p1 = pq1.poll();
            if (!pq.isEmpty()) {
                if (pq.peek()[1] <= p1[0]) {
                    pq.remove();
                } else {
                    ans++;
                }
            }
            pq.offer(p1);
        }
        System.out.println(ans);
    }
}
