import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        int n1 = 0, n2 = 0;
        for (int i = 0; i < N.length/2; i++) {
            n1 += N[i];
            n2 += N[N.length/2+i];
        }
        if (n1 == n2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

    }
}

