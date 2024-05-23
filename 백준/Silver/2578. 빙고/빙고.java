import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                map.put(n, new int[]{i, j});
            }
        }
        int[] visited = new int[12];
        Arrays.fill(visited, 5);
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            if (cnt >= 3) {
                break;
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                int[] location = map.get(n);
                ans += 1;
                visited[location[0]]-=1;
                visited[location[1]+5]-=1;
                if (location[0] == location[1]) {
                    visited[10] -= 1;
                    if (visited[10] == 0) {
                        cnt += 1;
                    }
                }
                if ((location[0] + location[1]) == 4) {
                    visited[11] -= 1;
                    if (visited[11] == 0) {
                        cnt += 1;
                    }
                }
                if (visited[location[0]] == 0) {
                    cnt += 1;
                }
                if (visited[location[1] + 5] == 0) {
                    cnt += 1;
                }
                if (cnt >= 3) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

}
