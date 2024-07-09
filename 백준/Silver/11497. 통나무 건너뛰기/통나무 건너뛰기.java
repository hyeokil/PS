import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> lst = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                lst.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(lst);
            int res = lst.get(1)-lst.get(0);
            for (int i = 2; i < N; i += 2) {
                res = Math.max(res, lst.get(i)-lst.get(i-2));
            }
            res = Math.max(res, lst.get(N - 1) - lst.get(N - 2));
            int idx;
            if (N % 2 == 0) {
                idx = N - 1;
            } else {
                idx = N - 2;
            }
            for (int i = idx; i >=3 ; i -= 2) {
                res = Math.max(res, lst.get(i)-lst.get(i-2));
            }
            ans.append(res+"\n");

        }
        System.out.println(ans);

    }
}

