import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        String S ;
        while ((S=br.readLine())!=null) {
            long N = Long.parseLong(S);
            long one= 1;
            long res = 1;
            while ((one%=N)!=0) {
                res++;
                one*=10;
                one++;
            }
            ans.append(res+"\n");            
        }
        System.out.println(ans);
    }
}
