import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int ans = 0;
        int e=N-1;
        for (int i = 0; i < N-1; i++) {
            while (i<e) {
                if (arr[i] + arr[e] > S) {
                    e--;
                } else {
                    ans+=e-i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
