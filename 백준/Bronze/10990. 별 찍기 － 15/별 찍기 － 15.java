import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i-1; j++) {
                ans.append(" ");
            }
            ans.append("*");
            for (int j = 0;j<2*i-1;j++) {
                ans.append(" ");
            }
            if (i != 0) {
                ans.append("*");
            }
            if (i != N - 1) {
                ans.append("\n");
            }
        }

        System.out.println(ans);
    }
}
