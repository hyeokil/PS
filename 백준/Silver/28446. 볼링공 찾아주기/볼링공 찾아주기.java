import java.io.*;
import java.util.*;

public class Main {
    static byte A;
    static int B, C;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            A = Byte.parseByte(st.nextToken());
            if (A == 1) {
                B = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());
                map.put(C, B);
            } else {
                C = Integer.parseInt(st.nextToken());
                bw.write(Integer.toString(map.get(C)));
                bw.newLine();
            }
        }
        bw.close();

    }
}
