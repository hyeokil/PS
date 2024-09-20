import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int N = Integer.parseInt(input[0])
                ,M = Integer.parseInt(input[1]);
        int gcd = BigInteger.valueOf(N).gcd(BigInteger.valueOf(M)).intValue();
        System.out.println(N/gcd+":"+M/gcd);

    }
}
