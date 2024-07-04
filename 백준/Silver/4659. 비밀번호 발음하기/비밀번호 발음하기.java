import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            char[] S = br.readLine().toCharArray();
            if (S.length==3 && S[0]=='e' && S[1]=='n' && S[2]=='d') {
                System.out.println(ans);
                break;
            }
            int cnt1 = 0, cnt2 =0;
            boolean check = false;
            for (int i = 0; i < S.length; i++) {
                if (S[i] == 'a' || S[i] == 'e' || S[i] == 'i' || S[i] == 'o' || S[i] == 'u') {
                    check = true;
                    cnt1++;
                    cnt2 = 0;
                } else {
                    cnt1 = 0;
                    cnt2++;
                }
                if (cnt1>2 || cnt2>2) {
                    check = false;
                    break;
                }
                if (i > 0 && S[i - 1] == S[i]) {
                    if (S[i] != 'e' && S[i] != 'o') {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                ans.append('<' + String.valueOf(S) + "> is acceptable.");
            } else {
                ans.append('<' + String.valueOf(S) + "> is not acceptable.");
            }
            ans.append("\n");
        }
    }
}

