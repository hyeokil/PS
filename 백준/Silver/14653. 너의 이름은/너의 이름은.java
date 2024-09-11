import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int n, k, q;
    static int[] num = new int[10001];
    static char[] who = new char[10001];
    static int[] chk = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        q = Integer.parseInt(input[2]);

        for (int i = 1; i <= k; i++) {
            String[] data = br.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            char b = data[1].charAt(0);
            num[i] = a;
            who[i] = b;
        }

        if (num[q] == 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (num[q] <= num[i]) {
                chk[who[i] - 'A'] = 1;
            }
        }

        chk[0] = 1;

        for (int i = 0; i < n; i++) {
            if (chk[i] == 0) {
                ans.append((char) (i + 'A')).append(" ");
            }
        }

        System.out.println(ans);
    }
}
