import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int ans = 0;
        for (int i = 0; i < N-1; i++) {
            char[] s = br.readLine().toCharArray();
            int[] check = new int[26];
            for (int j = 0; j < S.length; j++) {
                check[S[j] - 'A']++;
            }
            int cnt = 0 ;
            for (int j = 0; j < s.length; j++) {
                if (check[s[j] - 'A']>0) {
                    cnt++;
                    check[s[j] - 'A']--;
                }
            }
    
            if (S.length == s.length && (S.length==cnt || S.length==cnt+1) ) {
                ans++;
            }

            else if (S.length - s.length == 1 && S.length == cnt+1) {
                ans++;
            }

            else if (S.length - s.length == -1 && S.length == cnt) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

