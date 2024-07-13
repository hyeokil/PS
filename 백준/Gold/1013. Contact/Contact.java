import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = "(100+1+|01)+";
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (T-- > 0) {
            String S = br.readLine();
            if (S.matches(X)) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }
        System.out.println(ans);

    }
}

