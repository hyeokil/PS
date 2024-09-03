import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<Integer>[] fibers = new ArrayList[N+1];
        boolean[] visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            fibers[i] = new ArrayList<>();
        }
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    ,b = Integer.parseInt(st.nextToken());
            fibers[a].add(b);
            fibers[b].add(a);
        }
        int ans =0;
        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            Queue<Integer> q = new LinkedList<>();
            ans++;
            q.add(i);
            while (!q.isEmpty()) {
                int cur = q.poll();
                visited[cur] = true;
                for (Integer n : fibers[cur]) {
                    if (!visited[n]) {
                        q.add(n);
                    }
                }
            }
        }
        System.out.println(ans-1);
    }
}


