import java.io.*;
import java.util.*;

public class Main {
    static int f(int[] list){
        int res = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int tmp = (list[i] + list[j] + list[k])%10;
                    res = Math.max(res, tmp);
                }
            }
        }
        return res;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int ans = -1;
        int max = -1;
        for (int i = 1; i <= N; i++) {
            int[] list = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) list[j] = Integer.parseInt(st.nextToken());
            int tmp = f(list);
            if (tmp >= max) {
                max = tmp;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
