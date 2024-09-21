import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans =Long.MAX_VALUE,res=0;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            res+= Math.abs(arr[i][0]-arr[i-1][0])+Math.abs(arr[i][1]-arr[i-1][1]);
        }
        for (int i = 1; i < N-1; i++) {
            long tmp = res;
            tmp -=Math.abs(arr[i][0]-arr[i-1][0])+Math.abs(arr[i][1]-arr[i-1][1]);
            tmp -=Math.abs(arr[i][0]-arr[i+1][0])+Math.abs(arr[i][1]-arr[i+1][1]);
            tmp += Math.abs(arr[i-1][0]-arr[i+1][0])+Math.abs(arr[i-1][1]-arr[i+1][1]);
            ans = Math.min(tmp, ans);
        }
        System.out.println(ans);

    }
}
