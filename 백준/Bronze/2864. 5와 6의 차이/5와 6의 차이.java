import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        String S1 = st.nextToken();String S2 = st.nextToken();
        String N1 = S1.replace('6', '5');
        String N2 = S2.replace('6', '5');
        int ans1 = Integer.parseInt(N1) + Integer.parseInt(N2);
        N1 = S1.replace('5', '6');
        N2 = S2.replace('5', '6');
        int ans2 = Integer.parseInt(N1) + Integer.parseInt(N2);
        bw.write(ans1 + " " + ans2);
        bw.close();
    }
}
