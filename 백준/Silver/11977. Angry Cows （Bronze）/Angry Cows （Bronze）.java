import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] bay = new int[N];
        for (int i = 0; i < N; i++) {
            bay[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bay);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int cur = i;
            int rad = 1;
            int cnt = 1;

            // 왼쪽으로 폭발 확산
            int l = cur - 1;
            while (true) {
                if (l < 0 || bay[cur] - bay[l] > rad) {
                    break;
                }
                while (l >= 0 && bay[cur] - bay[l] <= rad) {
                    cnt++;
                    l--;
                }
                cur = l + 1;
                rad++;
            }

            // 초기화 후 오른쪽으로 폭발 확산
            cur = i;
            rad = 1;
            int r = cur + 1;
            while (true) {
                if (r >= N || bay[r] - bay[cur] > rad) {
                    break;
                }
                while (r < N && bay[r] - bay[cur] <= rad) {
                    cnt++;
                    r++;
                }
                cur = r - 1;
                rad++;
            }


            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);

    }
}