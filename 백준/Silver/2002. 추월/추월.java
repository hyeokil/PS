import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] lst1 = new String[N];
        String[] lst2 = new String[N];
        for (int i = 0; i < N; i++) {
            lst1[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            lst2[i] = br.readLine();
        }
        boolean[] visited = new boolean[N];
        int idx = N - 1;
        int ans = 0;
        for (int i = N-1; i >=0; i--) {
            while (visited[idx]) {
                idx--;
            }
            if (!lst1[i].equals(lst2[idx])) {
                ans++;
                for (int j = idx - 1; j >= 0; j--) {
                    if (lst1[i].equals(lst2[j])) {
                        visited[j] = true;
                    }
                }
            } else {
                idx--;
            }
        }
        System.out.println(ans);
    }
}

