import java.io.*;
import java.util.*;


public class Main {
    static int N;
    static StringBuilder sb;
    static boolean[] visited;

    static void f(int k, String curS) {
        if (k == N) {
            sb.append(curS);
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (k + 1 == N) {f(k + 1, curS + i+"\n");}
                else {f(k + 1, curS + i+" ");}
                visited[i] = false;
            }
        }
    }

    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
//        Arrays.fill(visited, false);
        f(0, "");
        System.out.println(sb);
    }

}