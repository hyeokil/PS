import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[4];
        boolean flag1 = true;
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            boolean flag2 = false;
            for (int j = 0; j < 4; j++) {
                if (list[j] < tmp) {
                    list[j] = tmp;
                    flag2 = true;
                    break;
                }
            }
            if (!flag2) {
                flag1 = false;
                break;
            }

        }
        if (flag1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}