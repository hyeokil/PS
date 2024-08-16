import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            long b = Long.parseLong(br.readLine());
            if (b == 0) {
                break;
            }
            long max = 0,S=0;
            for (long i =1;i*(i+1)/2<=b;i++) {
                long a = b-i*(i-1)/2;
                if (a % i == 0) {
                    long s = a / i;
                    if (s > 0 && i > max) {
                        max = i;
                        S = s;
                    }
                }
            }
            ans.append(S+" "+max+"\n");
        }
        System.out.println(ans);

    }
}