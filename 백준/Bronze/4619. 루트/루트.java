import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            String[] input = br.readLine().split(" ");
            int B = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);

            if (B == 0 && N == 0) break;

            int A = 1;
            while (Math.pow(A, N) < B) {
                A++;
            }

            if (Math.abs(Math.pow(A, N) - B) < Math.abs(Math.pow(A - 1, N) - B)) {
                ans.append(A).append("\n");
            } else {
                ans.append(A - 1).append("\n");
            }
        }
        System.out.print(ans);
    }
}
