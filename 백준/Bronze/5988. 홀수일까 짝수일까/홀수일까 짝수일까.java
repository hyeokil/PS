import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] n = br.readLine().toCharArray();
            if (n[n.length-1] % 2 == 0) {
                ans.append("even" + "\n");
            } else {
                ans.append("odd" + "\n");
            }
        }
        System.out.println(ans);
    }
}

