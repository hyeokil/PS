import java.io.*;
import java.util.*;


public class Main {

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            if (N == 1) {
                sb.append("0\n");}
            else {
                sb.append("1");
                for (int i = 2; i < N; i++) {
                    sb.append("2");;
                }
                sb.append("1\n");
            }

        }
        bw.write(String.valueOf(sb));
        bw.close();
    }

}
