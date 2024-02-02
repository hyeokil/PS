import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int sum = 0;
            int ans = 0;
            int max = 0;
            int flag=0;
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                sum += a;
                if (max < a ) {
                    max = a;
                    ans = i;
                    flag = 0;
                } else if (max==a) {
                    flag = 1;
                }
            }
            if (flag>0) {
                bw.write("no winner");
            } else if (sum < 2 * max) {
                bw.write("majority winner " + Integer.toString(ans));
            } else {
                bw.write("minority winner " + Integer.toString(ans));
            }
            bw.newLine();
        }
        bw.close();
    }
}
