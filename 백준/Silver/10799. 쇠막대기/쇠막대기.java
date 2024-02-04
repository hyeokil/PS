import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int ans =0, res=0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                res += 1;
            } else {
                if (S.charAt(i - 1) == '(') {
                    res -= 1;
                    ans += res;
                } else {
                    res -= 1;
                    ans += 1;
                }
            }
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
