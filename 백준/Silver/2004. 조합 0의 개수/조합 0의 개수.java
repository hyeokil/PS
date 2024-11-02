import java.io.*;
import java.util.*;

public class Main {
    static long f(long n,int e) {
        int res = 0;
        while (n >= e) {
            res+=(n/e);
            n/=e;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken())
                ,M = Long.parseLong(st.nextToken());
        long n5 = f(N,5)-f(N-M,5)-f(M,5);
        long n2 = f(N,2)-f(N-M,2)-f(M,2);
        System.out.println(Math.min(n5,n2));
    }
}
