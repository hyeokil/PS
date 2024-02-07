import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (true) {
            i += 1;
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) {
                break;
            }
            int ans;
            st = new StringTokenizer(br.readLine());
            if (V % P < L) {
                ans = V / P * L + V % P;
            } else {
                ans = V / P * L + L;
            }
            bw.write("Case "+i+": "+Integer.toString(ans));
            bw.newLine();

        }
        bw.close();
    }
}
