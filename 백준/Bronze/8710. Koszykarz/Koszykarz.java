import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken())
                , W = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken());
        System.out.println((W-K+M-1)/M);
    }
}
