import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        StringBuilder ans = new StringBuilder();
        List<int[]>[] arr = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < K; i++) {
            String[] Q = br.readLine().split(" ");
            int A = Integer.parseInt(Q[1])
                    , B = Integer.parseInt(Q[2]);
            if (Q[0].equals("1")) {
                arr[A].add(new int[]{B, Integer.parseInt(Q[3])});
                arr[B].add(new int[]{A, Integer.parseInt(Q[3])});
            } else {
                int[] dist = new int[N+1];
                PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
                Arrays.fill(dist, Integer.MAX_VALUE);
                dist[A] = 0;
                pq.add(new int[]{0, A});
                boolean flag = false;
                while (!pq.isEmpty()) {
                    int[] cur = pq.poll();
                    if (cur[1] == B){
                        ans.append(cur[0]).append("\n");
                        flag = true;
                        break;
                    }
                    if (cur[0]>dist[cur[1]]) continue;
                    for (int[] tmp: arr[cur[1]]) {
                        if (dist[tmp[0]]> tmp[1]+cur[0]) {
                            dist[tmp[0]] = tmp[1]+cur[0];
                            pq.add(new int[]{tmp[1]+cur[0], tmp[0]});
                        }
                    }

                }
                if (!flag) ans.append("-1\n");
            }
        }
        System.out.println(ans);
    }
}
