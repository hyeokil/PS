import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char tmp = '@';
            char[] s = br.readLine().toCharArray();
            for (char c : s) {
                if (c != tmp) {
                    tmp = c;
                    ans.append(c);
                }
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}


