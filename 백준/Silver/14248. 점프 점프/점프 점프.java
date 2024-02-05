import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] lst = new int[N];
        int[] visited = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
            visited[i] = 0;}
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken())-1;
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        while (q.size() > 0) {
            int x = q.poll();
            visited[x] = 1;
            if (x - lst[x] >= 0 && visited[x - lst[x]] == 0) {
                q.add(x - lst[x]);
            }
            if (x + lst[x] < N && visited[x + lst[x]] == 0) {
                q.add(x + lst[x]);
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {ans+=visited[i];}
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
