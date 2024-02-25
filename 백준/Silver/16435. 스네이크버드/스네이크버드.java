import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] lst = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {lst[i] = Integer.parseInt(st.nextToken());}
        Arrays.sort(lst);
        for (int i = 0; i < N; i++) {
            if (L >= lst[i]) {
                L += 1;
            } else {
                break;
            }
        }
        bw.write(Integer.toString(L));
        bw.close();
    }
}
