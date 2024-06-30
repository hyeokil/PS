import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (T-- > 0) {
            char[] W = br.readLine().toCharArray();
            int K = Integer.parseInt(br.readLine());
            if (K == 1) {
                ans.append("1 1\n");
            } else {
                List<Integer>[] check = new ArrayList[26];
                for (int i = 0; i < 26; i++) {
                    check[i] = new ArrayList<>();
                }
                for (int i = 0; i < W.length; i++) {
                    check[W[i] - 'a'].add(i);
                }
                int Min = Integer.MAX_VALUE;
                int Max = Integer.MIN_VALUE;
                for (int i = 0; i < 26; i++) {
                    if (check[i].size() >= K) {
                        for (int j = K-1; j < check[i].size(); j++) {
                            int tmp = check[i].get(j) - check[i].get(j - K + 1)+1;
                            Min = Math.min(Min, tmp);
                            Max = Math.max(Max, tmp);
                        }
                    }
                }
                if (Max == Integer.MIN_VALUE) {
                    ans.append("-1\n");
                } else {
                    ans.append(Min +" "+Max+"\n");
                }
            }
        }
        System.out.println(ans);

    }
}