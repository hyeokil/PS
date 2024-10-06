import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken()),L=Long.parseLong(st.nextToken())
                ,W=Long.parseLong(st.nextToken()),H=Long.parseLong(st.nextToken());
        double S = 0,E = Math.min(Math.min(L,W),H);
        for (int i = 0; i < 1000; i++) {
            double mid = (S+E)/2;
            if ((long)(L/mid) *(long) (W/mid) *(long) (H/mid)<N) {
                E = mid;
            } else {
                S = mid;
            }
        }
        System.out.print(S);
    }
}
