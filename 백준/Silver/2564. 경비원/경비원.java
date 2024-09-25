import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        int[][] arr = new int[K][2];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            if (d == 1) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = 0;
            } else if (d == 2) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = M;
            }else if (d == 3) {
                arr[i][0] = 0;
                arr[i][1] = Integer.parseInt(st.nextToken());
            }else if (d == 4) {
                arr[i][0] = N;
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int d=Integer.parseInt(st.nextToken()),x=0,y=0;
        if (d == 1) {
            x=Integer.parseInt(st.nextToken());
        }else if (d == 2) {
            x=Integer.parseInt(st.nextToken());
            y=M;
        }else if (d == 3) {
            x = 0;y=Integer.parseInt(st.nextToken());
        }else if (d == 4) {
            x=N;y=Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i = 0; i < K; i++) {
            if (d == 1 &&arr[i][1] == M) {
                ans += Math.min(arr[i][0] + x, N - arr[i][0] + N - x) + M;
            }else if(d == 2 &&arr[i][1] == 0){
                ans += Math.min(arr[i][0] + x, N - arr[i][0] + N - x) + M;
            } else if (d == 3 && arr[i][0] == N) {
                ans += Math.min(arr[i][1]+y,M-arr[i][1]+M-y)+N;
            } else if (d == 4 && arr[i][0] == 0) {
                ans += Math.min(arr[i][1] + y, M - arr[i][1] + M - y) + N;
            } else {
                ans += Math.abs(arr[i][0]-x)+Math.abs(arr[i][1]-y);
            }
        }
        System.out.println(ans);
    }
}
