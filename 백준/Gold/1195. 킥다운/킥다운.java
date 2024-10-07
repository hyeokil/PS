import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =Integer.MAX_VALUE;
        char[] S1 = br.readLine().toCharArray();
        char[] S2 = br.readLine().toCharArray();
        int L1 = S1.length, L2 = S2.length;
        for (int i = 0; i < L1; i++) {
            int tmp =0;
            for (int j = 0; j < L2; j++) {
                if (i+j==L1||(S1[i+j] =='2'&& S2[j]=='2')) {
                    break;
                }
                tmp++;
            }
            if (tmp == Math.min(L1-i,L2)) {
                ans = Math.min(ans, Math.max(L1,L2+i));
            }
        }
        for (int i = 0; i < L2; i++) {
            int tmp =0;
            for (int j = 0; j < L1; j++) {
                if (i+j==L2||S1[j] =='2'&& S2[i+j]=='2') {
                    break;
                }
                tmp++;
            }
            if (tmp == Math.min(L2-i,L1)) {
                ans = Math.min(ans, Math.max(L2,L1+i));
            }
        }
        System.out.print(ans==Integer.MAX_VALUE?L1+L2:ans);
    }
}
