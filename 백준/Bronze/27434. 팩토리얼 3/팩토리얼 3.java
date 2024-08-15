import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BigInteger fac(int a, int N) {
        BigInteger n = BigInteger.valueOf(a);
        if (a < N) {
            int b = (a + N) / 2;
             n = fac(a,b).multiply(fac(b+1,N));
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(fac(1,N));
    }
}
