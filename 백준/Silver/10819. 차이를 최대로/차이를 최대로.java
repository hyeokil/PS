import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Main {
    public static int N,ans;
    public static Boolean[] visited;
    public static int[] lst,res;

    public static void f(int k) {
        if (k == N) {
            int tmp=0;
            for (int i = 1; i < N; i++) {
                tmp += abs(res[i - 1] - res[i]);
            }
            ans = max(ans, tmp);
            return;
        }
        for (int j = 0; j < N; j++) {
            if (visited[j]) {
                continue;
            }
            res[k] = lst[j];
            visited[j] = true;
            f(k + 1);
            visited[j] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        visited = new Boolean[N];
        lst = new int[N];
        res = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
            visited[i] = false;
            res[i] = 0;
        }
        f(0);
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
