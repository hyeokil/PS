import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int idx10 = 7, idx12 = 9;
        for (int i = 2; i <= N; i++) {
            idx10++;
            if (idx10 == 10) idx10 = 0;
            idx12++;
            if (idx12 == 12) idx12 = 0;
        }
        char c = (char)(idx12 + 'A');
        ans.append(c).append(idx10);
        System.out.println(ans);
    }
}
