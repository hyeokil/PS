 import java.io.*;
import java.util.*;

public class Main {
    static long C;
    static long f(long a, long b) {
        if (b == 1) return a%C;
        long tmp = f(a, b/2);
        if (b%2==0) return tmp*tmp%C;
        else return (tmp*tmp%C)*a%C;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken())
                ,B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        System.out.println(f(A,B));

    }
}


