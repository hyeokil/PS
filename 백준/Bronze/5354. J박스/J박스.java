import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char[][] res = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==0 || i==n-1) {
                        ans.append('#');
                    }else{
                        if (j==0 || j==n-1) {
                            ans.append('#');
                        }else{
                            ans.append('J');
                        }
                    }
                }
                ans.append('\n');
            }
            ans.append('\n');
        }
        System.out.println(ans);
    }

}