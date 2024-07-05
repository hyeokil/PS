import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input ;
        while ((input=br.readLine())!=null && !input.isEmpty()) {
            char[] S = input.toCharArray();
            int[] ans = new int[4];
            for (int i = 0; i < S.length; i++) {
                if (S[i] == ' ') {
                    ans[3]++;
                } else if ('a' <= S[i] && S[i] <= 'z') {
                    ans[0]++;
                } else if ('A' <= S[i] && S[i] <= 'Z') {
                    ans[1]++;
                } else if ('0' <= S[i] && S[i] <= '9') {
                    ans[2]++;
                }
            }
            for (int i = 0; i < 4; i++) {
                sb.append(ans[i]);
                if (i == 3) {
                    sb.append("\n");
                } else {
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}

