import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] lst = new int[N + 1];
            Boolean[] visited = new Boolean[N + 1];
            for (int i = 0; i <= N; i++) {
                lst[i] = 0;
                visited[i] = true;
            }
            for (int i = 0; i < N - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                lst[b] = a;
            }
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while (visited[a]) {
                visited[a] = false;
                a = lst[a];
            }
            while (visited[b]) {
                b = lst[b];
            }
            bw.write(Integer.toString(b));
            bw.newLine();

        }
        bw.close();
    }
}

