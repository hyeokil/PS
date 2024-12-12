import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] fibo = new long[68];
        fibo[0] = fibo[1] = 1;
        fibo[2] = 2;
        fibo[3] = 4;
        for (int i = 4; i < 68; i++) fibo[i] = fibo[i - 1] + fibo[i - 2] + fibo[i - 3] + fibo[i - 4];
        while (T-->0) ans.append(fibo[Integer.parseInt(br.readLine())]+"\n");
        System.out.println(ans);
    }

}