import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] lst = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        int max = 0;
        for (int i = 0; i < N-1; i++) {
            if (max > lst[i]) {
                continue;
            }
            max = lst[i];
            int tmp = 0;
            for (int j = i + 1; j < N; j++) {
                if (lst[i] > lst[j]) {
                    tmp++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, tmp);
            
        }
        System.out.println(ans);


    }
}

