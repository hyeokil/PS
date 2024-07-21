import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String[] S = br.readLine().split(" ");
            ans.append("Case #" + i + ": ");
            for (int j = S.length-1; j >=0; j--) {
                ans.append(S[j]);
                if (j != 0) ans.append(" ");
            }
            if (i != N) ans.append("\n");
        }
        System.out.println(ans);
    }
}
