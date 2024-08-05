import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()),B=Integer.parseInt(st.nextToken()),N=Integer.parseInt(st.nextToken()),M=Integer.parseInt(st.nextToken());
        int[] D = {A, B,-A,-B,1,-1};
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        q.add(new int[]{N,0});
        while(!q.isEmpty()){
            int[] cur = q.remove();
            int V = cur[0],cnt =cur[1];
            if (V==M){
                System.out.println(cnt);
                break;
            }
            for (int i = 0; i < 6; i++) {
                int now = V+D[i];
                if (0<=now && now<=100000 && !visited[now]){
                    visited[now] = true;
                    q.add(new int[]{now,cnt+1});
                }
            }
            for (int i = 0; i < 2; i++) {
                int now = V*D[i];
                if (0<=now && now<=100000 && !visited[now]){
                    visited[now] = true;
                    q.add(new int[]{now,cnt+1});
                }
            }
        }

    }
}
