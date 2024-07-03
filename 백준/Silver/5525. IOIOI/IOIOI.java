import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int cnt = 0,ans = 0;
        for (int i = 1; i < M-1;) {
            if (S[i] == 'O' && S[i + 1] == 'I') {
                cnt++;
                if (cnt >=N&&S[i-(2*N-1)]=='I') {
                    ans++;cnt--;
                }
                i += 2;
            }else{
                cnt=0;i++;
            }

        }
        System.out.println(ans);


    }
}

