import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (N + M - 1 > K) {
            bw.write("NO");
        } else {
            int[][] lst = new int[N][M];
            for (int i = 1; i <= N; i++) {
                lst[i-1][0] = i;
            }
            bw.write("YES");
            bw.newLine();
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < M; j++) {
                    lst[i][j] = lst[i][j - 1] + 1;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    String tmp =" ";
                    if (j == M - 1) {
                        tmp="";
                    }
                    bw.write(Integer.toString(lst[i][j])+tmp);
                }
                bw.newLine();
            }

        }

        bw.close();
    }
}
