import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , M= Integer.parseInt(st.nextToken());
        int[] ans = new int[N];
        PriorityQueue<Integer>[] pq = new PriorityQueue[200001];
        for (int i = 1; i <= 200000; i++) {
            pq[i] = new PriorityQueue<>();
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            while (m-- > 0) {
                pq[Integer.parseInt(st.nextToken())].add(i);
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(st.nextToken());
            if (!pq[p].isEmpty()) {
                int cur = pq[p].poll();
                ans[cur]++;
            }
        }
        System.out.println(Arrays.toString(ans).replace("[","").replace("]","").replaceAll(",",""));
    }
}


