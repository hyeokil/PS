import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),M=Integer.parseInt(st.nextToken());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] S = br.readLine().toCharArray();
            for (int j = M-1; j >=0; j--) {
                ans.append(S[j]);
            }
            if (i != N - 1) {
                ans.append('\n');
            }
        }
        System.out.println(ans);
    }
}

