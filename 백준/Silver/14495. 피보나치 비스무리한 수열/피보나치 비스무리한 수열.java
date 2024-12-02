import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        int N = Integer.parseInt(br.readLine());
        long[] fibo = new long[N+4];
        fibo[1]=fibo[2]=fibo[3]=1;
        for(int i=4;i<=N;i++) fibo[i]=fibo[i-1]+fibo[i-3];
        ans = fibo[N];
        System.out.println(ans);
    }
}
