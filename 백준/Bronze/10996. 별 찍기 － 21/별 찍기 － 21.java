import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            ans.append("*");
        } else {
            for (int i = 0; i < N*2; i++) {
                for (int j = 0; j < N; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            ans.append("*");
                        } else {
                            ans.append(" ");
                        }
                    } else {
                        if (j % 2 == 0) {
                            ans.append(" ");
                        } else {
                            ans.append("*");
                        }
                    }
                }
                ans.append("\n");
            }
        }

        System.out.println(ans);

    }
}
