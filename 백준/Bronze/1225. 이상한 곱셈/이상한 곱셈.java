import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();
        Long ans = 0L;
        for (char a : A) {
            for (char b : B) {
                ans += Character.getNumericValue(a) * Character.getNumericValue(b);

            }
        }
        System.out.println(ans);

    }
}
