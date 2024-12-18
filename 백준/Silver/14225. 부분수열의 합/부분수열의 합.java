import java.io.*;
import java.util.*;

public class Main {
    static int K,sum=0;
    static int[] V;
    static boolean[] check;
    static void f(int k, int curV){
        check[curV] = true;
        if (k==K) return;
        f(k+1,curV);
        f(k+1,curV+V[k]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = new int[K];
        for (int i = 0; i < K; i++) {
            V[i] = Integer.parseInt(st.nextToken());
            sum += V[i];
        }
        check = new boolean[sum+2];
        f(0,0);
        for (int i = 0; i < sum+2; i++) {
            if (check[i]) continue;
            ans = ans.append(i);
            break;
        }
        System.out.println(ans);
    }
}
