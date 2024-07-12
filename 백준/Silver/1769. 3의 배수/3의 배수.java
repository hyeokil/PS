import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        int cnt = 0;
        while (N.length > 1) {
            cnt++;
            int n = 0;
            for (int i = 0; i < N.length; i++) {
                n += N[i] - 48;
            }
            N = (n+"").toCharArray();
        }
        if ((N[0] - 48) % 3 == 0) {
            System.out.println(cnt + "\n" + "YES");
        } else {
            System.out.println(cnt+"\n"+"NO");
        }
    }
}

