import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long M = 1000000;
        long a=0,b =  1;
        N %= (15 * (100000));
        for (int i = 0; i < N-1; i++) {
            long tmp = b % M;
            b = (a + b) % M;
            a = tmp;
        }
        System.out.println(b);
    }

}