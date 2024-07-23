import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()),M=Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        boolean[] visited = new boolean[101];
        Queue<Integer[]> q = new LinkedList<>();
        q.add(new Integer[]{1,0});
        while (!q.isEmpty()) {
            Integer[] now = q.remove();
            int X = now[0],cnt = now[1];
            if (X == 100) {
                System.out.println(cnt);
                break;
            }
            visited[X] = true;
            for (int i = 6; i >=1 ; i--) {
                if (X + i > 100 || visited[X+i]) continue;
                if (map.containsKey(X+i)) {
                    q.add(new Integer[]{map.get(X+i), cnt+1});
                    visited[X+i] = true;
                } else {
                    q.add(new Integer[]{X + i, cnt+1});
                }
            }
        }
    }
}
