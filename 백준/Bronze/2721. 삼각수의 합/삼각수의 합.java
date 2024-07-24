import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            int fac = 1;
            for (int i = 1; i <= N; i++) {
                fac+=i+1;
                sum+=i*fac;
            }
            ans.append(sum);
            if (tc!=T-1) ans.append("\n");
        }
        System.out.println(ans);
    }
}
