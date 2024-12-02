import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[1]);
        StringBuilder ans = new StringBuilder();
        int cnt =0;
        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            cnt+=input[0].length();
            ans.append(input[0]);
            if (cnt>=M) break;
        }
        ans.setLength(Math.min(M, ans.length()));
        System.out.println(ans);
    }
}
