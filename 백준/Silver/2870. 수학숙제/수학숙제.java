import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int gcd(int a,int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N =Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int idx = 0;
            while (idx<input.length()) {
                idx++;
                if (input.charAt(idx-1)<'0' || input.charAt(idx-1)>'9') continue;
                int j=idx;
                for (;j < input.length(); j++) {
                    if (input.charAt(j)<'0' || input.charAt(j)>'9') break;
                }
                BigInteger num = new BigInteger(input.substring(idx-1,j));
                list.add(num);
                idx = j;
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            ans.append(list.get(i)+"\n");
        }
        System.out.println(ans);
    }
}
