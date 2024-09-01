import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M=Integer.parseInt(st.nextToken());
        StringBuilder ans = new StringBuilder();
        int[][] arr = new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(arr[i], 101);
            arr[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    ,b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    arr[i][j] = arr[j][i] = Math.min(arr[i][j],arr[i][k] + arr[k][j]);
                }
            }
        }
        int min = Integer.MAX_VALUE
                ,a=0,b=0;
        for (int i = 1; i <= N; i++) {
            for (int j = i+1; j <= N; j++) {
                int tmp = 0;
                for (int k = 1; k <= N; k++) {
                    if (min<=tmp) break;
                    tmp +=Math.min(arr[i][k],arr[j][k]);
                }
                if (min>tmp) {
                    min = tmp;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(a+" "+b+" "+min*2);
    }
}
