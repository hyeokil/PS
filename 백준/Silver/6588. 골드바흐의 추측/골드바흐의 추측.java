import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Boolean[] check = new Boolean[1000001];
        Arrays.fill(check, true);
        check[1] = false;
        for (int i = 3; i < 1001; i += 2) {
            if (check[i]) {
                for (int j = i * 3; j < 1000001; j += i * 2) {
                    check[j] = false;
                }
            }
        }

        while (true) {
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            for (int i = 3; i < N / 2 + 1; i += 2) {
                if (check[i] && check[N - i]) {
                    bw.write(N+" = "+i+" + "+(N-i));

                    break;
                }
            }
            st = new StringTokenizer(br.readLine());
            bw.newLine();

        }
        bw.close();

    }
}