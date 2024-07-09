import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int cnt = 1;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            if (S[i] == 'S') {
                cnt++;
            } else if (S[i] == 'L') {
                if (flag) {
                    cnt++;
                    flag = false;

                } else {
                    flag = true;
                }
            }
        }
        System.out.println(Math.min(N, cnt));
    }
}

