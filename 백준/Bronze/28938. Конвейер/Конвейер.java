import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ans += Integer.parseInt(st.nextToken());
        }
        if (ans > 0) {
            System.out.println("Right");
        } else if (ans < 0) {
            System.out.println("Left");
        } else System.out.println("Stay");

    }
}
