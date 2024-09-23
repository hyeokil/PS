import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken())
                ,K = Integer.parseInt(st.nextToken());
        int ans =0;
        while (N >= 2 && M >= 1&&N-2+M-1>=K) {
            N-=2;
            M -= 1;
            ans++;
        }
        System.out.println(ans);
    }
}
