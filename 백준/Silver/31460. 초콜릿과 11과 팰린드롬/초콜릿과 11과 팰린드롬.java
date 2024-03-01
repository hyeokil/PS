import java.io.*;
import java.util.*;


public class Main {

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String ans ;
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            ans="";
            if (N == 1) {ans += "0";}
            else {
                ans+="1";
                for (int i = 0; i < N - 2; i++) {
                    ans += "2";
                }
                ans += "1";
            }
            bw.write(ans);
            bw.newLine();
        }
        bw.close();
    }

}
