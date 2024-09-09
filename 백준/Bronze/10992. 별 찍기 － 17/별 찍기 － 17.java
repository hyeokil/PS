import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            for(int j = N; j > i; j--) {
                ans.append(" ");
            }

            if (i == N) {
                for(int j = 0; j < 2 * i - 1; j++) {
                    ans.append("*");
                }
            } else {
                for(int j = 0; j < 2 * i - 1; j++) {
                    if(j == 0 || j == 2 * i - 1 - 1) {
                        ans.append("*");
                    } else {
                        ans.append(" ");
                    }
                }
            }
            ans.append("\n");
        }
        System.out.println(ans);

    }
}