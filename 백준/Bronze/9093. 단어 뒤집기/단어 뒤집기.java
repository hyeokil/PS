import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (T-- > 0) {
            char[] S = br.readLine().toCharArray();
            String tmp = "";
            for (int i = 0; i < S.length; i++) {
                if (S[i] == ' ') {
                    ans.append(tmp+" ");
                    tmp = "";
                }else{
                    tmp = S[i]+tmp;
                }

            }
            ans.append(tmp+'\n');

        }
        System.out.println(ans);


    }
}

