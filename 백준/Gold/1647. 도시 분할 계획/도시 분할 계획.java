import java.io.*;
import java.util.*;

public class Main {
    static int readInt() throws IOException {
        int val = 0;
        do {
            int c = System.in.read();
            if (c == ' ' || c == '\n') break;
            val = 10*val + c-48;
        } while (true);
        return val;
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();

        List<List<int[]>> arr = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = readInt();
            int b = readInt();
            int c = readInt();
            arr.get(a).add(new int[]{b, c});
            arr.get(b).add(new int[]{a, c});
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 1});

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int nowD = pair[0];
            int now = pair[1];

            if (dist[now] != -1) continue;

            dist[now] = nowD;

            for (int[] next : arr.get(now)) {
                int go = next[0];
                int goD = next[1];
                if (dist[go] != -1) continue;
                pq.offer(new int[]{goD, go});
            }
        }

        int ans = Arrays.stream(dist).sum()-Arrays.stream(dist).max().orElse(0);

        System.out.println(ans);
    }
}
