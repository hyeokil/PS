import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();
        int A = 0;
        int ans = Integer.MAX_VALUE;
        for (char s : S) {
            if (s=='a') {
                A += 1;
            }
        }
        for (int i = 0; i< S.length; i++) {
            int B = 0;
            for (int j = i; j< A+i; j++) {
                if (S[j%S.length]=='b') {
                    B += 1;
                }
            }
            ans = Math.min(ans, B);
            if (ans == 0) {
                break;
            }
        }
        System.out.print(ans);
    }
}

