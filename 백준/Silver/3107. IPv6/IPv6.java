 import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        String[] input = br.readLine().split(":");
        int tmp = 8;
        for (String s : input) {
            if (!s.equals("")) {
                tmp--;
            }
        }
        boolean flag = false;
        for (int j=0;j<input.length;j++) {
            if (input[j].equals("")) {
                if (!flag) {
                    flag = true;
                    for (int i = 0; i < tmp; i++) {
                        ans.append("0000:");
                    }
                }
                continue;
            }
            for (int i = 0; i < 4 - input[j].length(); i++) {
                ans.append(0);
            }
            ans.append(input[j]+":");
            if (j == input.length - 1 && !flag) {
                for (int i = 0; i < tmp; i++) {
                    ans.append("0000:");
                }
            }
        }
        ans.setLength(ans.length()-1);
        System.out.println(ans);

    }
}


