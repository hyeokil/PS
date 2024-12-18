import java.io.*;
import java.util.*;

public class Main {
    static Set<Integer> set = new HashSet<>();
    static int K,sum=0;
    static int[] V;
    static void f(int k, int curV){
        if (curV>0) set.add(curV);
        if (k==K) return;
        f(k+1,curV);
        f(k+1,curV+V[k]);
        f(k+1,curV-V[k]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = new int[K];
        for (int i = 0; i < K; i++) {
            V[i] = Integer.parseInt(st.nextToken());
            set.add(V[i]);
            sum+=V[i];
        }
        f(0,0);
        ans.append(sum-set.size());
        System.out.println(ans);
    }
}
