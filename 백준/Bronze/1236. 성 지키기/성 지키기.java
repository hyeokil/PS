import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] nVisited = new boolean[N];
        boolean[] mVisited = new boolean[M];
        int nRes=0;
        int mRes=0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean flag = false;
            for (int j = 0; j < M; j++) {
                if (s.charAt(j) == 'X') {
                    nVisited[i] = true;
                    mVisited[j] = true;
                    flag = true;
                }
            }
            if (!flag) {
                nRes+=1;
            }
        }
        for (int i = 0; i < M; i++) {
            if (!mVisited[i]) {
                mRes+=1;
            }
        }
        System.out.println(Math.max(nRes,mRes));
    }
}
