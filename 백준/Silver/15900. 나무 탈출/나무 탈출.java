import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] arr = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) arr[i] = new ArrayList<>();
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        boolean[] visited = new boolean[N+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});
        int ans = 0;
        while (!q.isEmpty()) {
            int[] now = q.remove();
            int X=now[0], cnt=now[1];
            visited[X] = true;
            boolean flag = false;
            for (int i : arr[X]) {
                if (!visited[i]) {
                    q.add(new int[] {i,cnt+1});
                    flag = true;
                }
            }
            if (!flag) ans+=cnt;
        }
        if (ans % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
