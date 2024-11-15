import java.io.*;
import java.util.*;

public class Main {
    static int[] visited;
    static List<Integer>[] road;
    static int idx = 1;
    static void dfs(int a){
        visited[a]=idx;
        idx++;
        for (int n :road[a]){
            if (visited[n]==0) dfs(n);
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(st.nextToken())
        ,M = Integer.parseInt(st.nextToken())
        ,R = Integer.parseInt(st.nextToken());
        road = new ArrayList[N+1];
        for (int i=1;i<=N;i++) road[i] = new ArrayList<>();
        visited = new int[N+1];
        while (M-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
            ,b = Integer.parseInt(st.nextToken());
            road[a].add(b);
            road[b].add(a);
        }
        for (int i=1;i<=N;i++) road[i].sort((o1,o2)->o2-o1);
        dfs(R);
        for (int i=1;i<=N;i++) {
            ans.append(visited[i]);
            if (i!=N) ans.append("\n");
        }
        System.out.println(ans);
    }
}
