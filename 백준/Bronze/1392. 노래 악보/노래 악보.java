import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] time = new int[N];
        int[] cumulativeTimes = new int[N];


        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(br.readLine());
            if (i == 0) {
                cumulativeTimes[i] = time[i];
            } else {
                cumulativeTimes[i] = cumulativeTimes[i - 1] + time[i];
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int T = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                if (T < cumulativeTimes[j]) {
                    ans.append(j + 1).append("\n");
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}
