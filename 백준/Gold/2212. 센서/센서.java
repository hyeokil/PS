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
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if (N <= K) {
            System.out.println(0);
            return;
        }
        List<Integer> lst = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lst.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(lst);
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < N-1; i++) {
            diff.add(lst.get(i+1)-lst.get(i));
        }
        Collections.sort(diff);
        int ans = 0;
        for (int i = 0; i < N-K; i++) {
            ans+=diff.get(i);
        }
        System.out.println(ans);


    }
}

