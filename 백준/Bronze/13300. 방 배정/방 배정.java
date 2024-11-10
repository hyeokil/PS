import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , K = Integer.parseInt(st.nextToken());
        int[][] students = new int[7][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken())
                    ,y = Integer.parseInt(st.nextToken());
            students[y][s]++;
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                ans += students[i][j]/K;
                if (students[i][j] % K != 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
