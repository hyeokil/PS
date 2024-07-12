import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            char[] S1 = st.nextToken().toCharArray();
            char[] S2 = st.nextToken().toCharArray();
            if (S1.length != S2.length) {
                ans.append("Impossible");
            } else {
                Arrays.sort(S1);
                Arrays.sort(S2);
                boolean flag = true;
                for (int i = 0; i < S2.length; i++) {
                    if (S1[i] != S2[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans.append("Possible");
                } else {
                    ans.append("Impossible");
                }
            }
            ans.append("\n");


        }
        System.out.println(ans);


    }
}

