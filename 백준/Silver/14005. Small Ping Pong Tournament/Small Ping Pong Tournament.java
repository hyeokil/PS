import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = (int)Math.pow(2, T);
        StringBuilder ans = new StringBuilder();
        int dudu = Integer.parseInt(br.readLine());
        if (T ==0) {
            ans.append("YES");
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N-1; i++) {
                min = Math.min(min, Integer.parseInt(br.readLine()));
            }
            if (min > dudu) {
                ans.append("NO");
            } else {
                ans.append("YES");
            }
        }
        System.out.print(ans);
    }
}
