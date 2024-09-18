import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 1;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            arr[i] = new int[] {Integer.parseInt(s[1]), Integer.parseInt(s[2])};
        }
        Arrays.sort(arr, (o1, o2) -> Arrays.compare(o1,o2) );
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        pq.offer(new int[]{arr[0][0], arr[0][1]});
        for (int i = 1; i < N; i++) {
            if (arr[i][0] >= pq.peek()[1]) {
                pq.remove();
            } else {
                ans++;
            }
            pq.add(new int[]{arr[i][0], arr[i][1]});
        }
        System.out.println(ans);
    }
}
