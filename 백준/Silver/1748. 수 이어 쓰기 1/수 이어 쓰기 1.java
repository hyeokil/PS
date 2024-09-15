import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0,tmp=1;
        String s = br.readLine();
        for (int i=0; i<s.length(); i++) {
            if (i != s.length() - 1) {
                ans += 9*tmp*(i+1);
                tmp *= 10;
            } else {
                int n = Integer.parseInt(s);
                ans+= (n-tmp+1)*(i+1);
            }
        }


        System.out.println(ans);

    }
}
