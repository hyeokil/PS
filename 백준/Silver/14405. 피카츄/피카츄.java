import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        String S = br.readLine();
        int L = S.length();
        int res = 0;
        if (L<2){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < L-2; i++) {
            if (S.substring(i, i+3).equals("chu")){
                res+=3;
            }
            if (S.substring(i, i+2).equals("pi")){
                res+=2;
            }
            if (S.substring(i, i+2).equals("ka")){
                res+=2;
            }
        }
        if (S.substring(L-2, L).equals("pi")){
            res+=2;
        }
        if (S.substring(L-2, L).equals("ka")){
            res+=2;
        }
        if (res == L) {
            ans.append("YES");
        }else {
            ans.append("NO");
        }
        System.out.print(ans);
    }
}
