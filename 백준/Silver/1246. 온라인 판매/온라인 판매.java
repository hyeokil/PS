import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> L = new ArrayList<Integer>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            L.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(L);
        int maxP = 0;
        int maxS = 0;
        for (int i = 0; i < M; i++) {
            int curP = L.get(i);
            int curS = 0;
            if (N > M - i) {
                curS = curP * (M - i);
            } else {
                curS = curP*N;
            }
            if (curS > maxS) {
                maxS = curS;
                maxP = curP;
            }
        }
        System.out.println(maxP+" "+maxS);



    }
}
