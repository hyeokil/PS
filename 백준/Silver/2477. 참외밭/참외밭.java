import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int K = Integer.parseInt(br.readLine());
        int[][] input = new int[6][2];
        int maxR=0, maxC = 0;
        List<Integer> min = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = input[i][0] = Integer.parseInt(st.nextToken())
                    ,b = input[i][1] = Integer.parseInt(st.nextToken());
            if (a == 1 || a == 2) {
                maxC = Math.max(maxC, b);
            } else {
                maxR = Math.max(maxR, b);
            }
        }
        for (int i = 0; i < 6; i++) {
            int a,b;
            if (i == 0) {
                a = input[5][0];
                b = input[i+1][0];
            } else if (i == 5) {
                a = input[i - 1][0];
                b = input[0][0];
            } else {
                a = input[i-1][0];
                b = input[i+1][0];
            }
            if (a == b) {
                min.add(input[i][1]);
            }
        }
        ans = (maxC*maxR - min.get(0)* min.get(1)) * K;
        System.out.println(ans);

    }
}
