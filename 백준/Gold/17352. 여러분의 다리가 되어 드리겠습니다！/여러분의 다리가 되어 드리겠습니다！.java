import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[] parent;
    static int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < N - 2; i++) {
            st = new StringTokenizer(br.readLine());

            union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        int A = find(1);
        for (int i = 2; i <= N; i++) {
            if (A != find(i)) {
                bw.write(1+" "+i);
                break;
            }
        }
        bw.close();
    }
}
