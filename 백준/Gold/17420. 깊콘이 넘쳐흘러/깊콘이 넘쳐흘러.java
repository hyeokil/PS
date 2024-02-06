import java.io.*;
import java.util.*;

import static java.lang.Math.max;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] lstA = new int[N];int[] lstB = new int[N];
        int[][] lst = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lstA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lstB[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            lst[i][0] = lstB[i];lst[i][1] = lstA[i];
        }
        Arrays.sort(lst, (o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));
        int tmp = lst[0][0];
        int rest = lst[0][1];
        Long ans = 0L;
        for (int i = 0; i < N; i++) {
            if (tmp > lst[i][1]) {
                int res = (tmp - lst[i][1]) / 30;
                if ((tmp - lst[i][1]) % 30 > 0) {
                    res += 1;
                }
                lst[i][1]+=res*30;ans+=res;
            }
            rest = max(rest, lst[i][1]);
            if (i + 1 < N && lst[i][0] != lst[i + 1][0]) {
                tmp = max(rest, lst[i + 1][0]);
            }
        }
        bw.write(Long.toString(ans));
        bw.close();
    }
}
