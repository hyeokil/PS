import java.util.*;
import java.io.*;

public class Main {
    static int K;
    static String[] Q;
    static boolean[] visited = new boolean[10];
    static String max,min;

    static void f(int k, String cur) {
        if (k == K+1) {
            for (int i = 0; i < K; i++) {
                if (Q[i].equals(">") && cur.charAt(i)<cur.charAt(i+1)) {
                    break;
                }else if (Q[i].equals("<") && cur.charAt(i)>cur.charAt(i+1)){
                    break;
                }
                if (i == K - 1) {
                    if (Long.parseLong(cur) > Long.parseLong(max)) {
                        max = cur;
                    }
                    if (Long.parseLong(cur) < Long.parseLong(min)) {
                        min = cur;
                    }
                }
            }
            return;

        }
        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                visited[i] = true;
                f(k + 1, cur+i);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K =Integer.parseInt(br.readLine());
        Q = br.readLine().split(" ");
        max = "0";
        min = "9999999999";
        f(0, "");
        System.out.println(max+"\n"+min);
    }
}
