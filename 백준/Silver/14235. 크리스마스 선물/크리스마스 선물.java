import java.io.*;
import java.util.*;


public class Main {
    static int N,a;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        short T = Short.parseShort(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                if (q.isEmpty()) {bw.write("-1");}
                else{bw.write(Integer.toString(-q.poll()));}
                bw.newLine();
            }else{
                for (int j = 1; j <= N; j++) {
                    a = Integer.parseInt(st.nextToken());
                    q.add(-a);
                }

            }
        }
        bw.close();
    }
}
