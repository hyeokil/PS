import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int a,int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            int b = Integer.parseInt(st.nextToken());
            int tmp = gcd(a,b);
            ans.append(a/tmp+"/"+b/tmp+"\n");
        }
        System.out.println(ans);
    }
}
