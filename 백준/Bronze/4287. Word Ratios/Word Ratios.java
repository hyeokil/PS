import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            String[] S = br.readLine().split(" ");
            if (S[0].equals("#")) break;
            ans.append(S[0] + " "+ S[1] + " "+ S[2] + " ");
            for (int i = 0; i < S[0].length(); i++) {
                int tmp1 = S[1].charAt(i) >= S[0].charAt(i) ? S[1].charAt(i) - S[0].charAt(i) : S[1].charAt(i)+26-S[0].charAt(i);
                int tmp = S[2].charAt(i)+tmp1;
                ans.append((char) (tmp<123?tmp:tmp-26));
                if (i == S[0].length() - 1){ ans.append("\n");}
            }
        }
        System.out.println(ans);
    }
}
