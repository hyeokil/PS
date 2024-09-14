import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())-1,M=Integer.parseInt(st.nextToken())-1;
        int ans  = Math.abs(N/4-M/4) + Math.abs(N%4-M%4); ;
        System.out.println(ans);

    }
}
