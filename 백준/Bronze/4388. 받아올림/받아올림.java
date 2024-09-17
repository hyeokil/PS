import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if (n == 0 && m == 0) break;

            int carryCount = 0;
            int carry = 0;

            while (n > 0 || m > 0) {
                int digitN = (int) (n % 10);
                int digitM = (int) (m % 10);
                int sum = digitN + digitM + carry;

                if (sum >= 10) {
                    carryCount++;
                    carry = 1;
                } else {
                    carry = 0;
                }

                n /= 10;
                m /= 10;
            }

            ans.append(carryCount).append("\n");
        }

        System.out.print(ans);
    }
}
