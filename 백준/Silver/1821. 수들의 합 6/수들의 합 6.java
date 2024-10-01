import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, F;
    static boolean[] visited;
    static int[] list ;
    static StringBuilder ans;
    static boolean flag = false;
    static void f(int k) {
        if (flag) return;
        if (k == N) {
            int[] tmp = list.clone();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N-i-1; j++) {
                    tmp[j] = tmp[j]+tmp[j+1];
                }
            }
            if (tmp[0] == F) {
                flag = true;
                for (int i = 0; i < N; i++) {
                    ans.append(list[i]);
                    if (i!=N-1) ans.append(" ");
                }
            }

        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list[k] = i;
                f(k+1);
                visited[i] = false;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ans = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        list = new int[N];
        f(0);
        System.out.print(ans);
    }
}
