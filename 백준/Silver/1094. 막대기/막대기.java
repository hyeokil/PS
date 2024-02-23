import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        byte X = 64;
        byte ans = 0;
        while (N > 0) {
            ans+=N/X;
            N%=X;
            X/=2;
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
