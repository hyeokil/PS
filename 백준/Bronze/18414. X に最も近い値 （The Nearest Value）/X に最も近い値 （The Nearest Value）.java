import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken())
                , L = Integer.parseInt(st.nextToken())
                , R = Integer.parseInt(st.nextToken());
        int ans =0 ;
        if (X < L) {
            ans = L;
        } else if (X > R) {
            ans = R;
        } else {
            ans = X;
        } 
        System.out.println(ans);
    }
}
