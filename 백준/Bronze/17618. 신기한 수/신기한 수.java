import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i=1;i<=N;i++){
            int res=0;
            char[] tmp = String.valueOf(i).toCharArray();
            for (char c:tmp)res+=c-'0';
            if (i%res==0) ans++;
        }
        System.out.println(ans);
    }
}
