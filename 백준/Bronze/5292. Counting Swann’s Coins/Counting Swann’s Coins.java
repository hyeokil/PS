import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        for (int i=1; i<=N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.append("DeadMan\n");
            }else if (i % 3 == 0 ) {
                ans.append("Dead\n");
            }else if (i % 5 == 0) {
                ans.append("Man\n");
            }else{
                ans.append(i+" ");
            }
        }
        System.out.println(ans);
    }
}
