import java.io.*;
import java.util.*;

public class Main {
    static List<int[]>[] list;
    static int[] dijk(int a, int v) {
        int[] dist = new int[v+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[a] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Arrays::compare);
        pq.offer(new int[]{0,a});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            for (int[] now : list[cur[1]]) {
                int nowD = now[1] + cur[0];
                if (nowD < dist[now[0]]) {
                    dist[now[0]] = nowD;
                    pq.offer(new int[]{nowD,now[0]});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,V = Integer.parseInt(st.nextToken())
                ,E = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken())
                ,B = Integer.parseInt(st.nextToken());
        int[] home = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            home[i] = Integer.parseInt(st.nextToken());
        }
        list = new List[V+1];
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    ,b = Integer.parseInt(st.nextToken())
                    ,l = Integer.parseInt(st.nextToken());
            list[a].add(new int[]{b, l});
            list[b].add(new int[]{a, l});
        }
        int[] distA = dijk(A, V);
        int[] distB = dijk(B, V);
        int ans =0;
        for (int i = 0; i < N; i++) {
            int res1 = distA[home[i]]!=Integer.MAX_VALUE?distA[home[i]]:-1
                    ,res2 =distB[home[i]]!=Integer.MAX_VALUE?distB[home[i]]:-1;
            ans += res1 + res2;
        }
        System.out.println(ans);

    }
}
