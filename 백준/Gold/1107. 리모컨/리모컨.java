import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()),
        M = Integer.parseInt(br.readLine());
        boolean[] remote = new boolean[10];
        if (M!=0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0;i<M;i++) remote[Integer.parseInt(st.nextToken())] = true;
        }
        int ans = Math.abs(N-100);
        for (int i=0;i<1000000;i++){
            char[] n = String.valueOf(i).toCharArray();
            boolean flag = true;
            for (char c:n){
                if (remote[c-'0']) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans = Math.min(ans,Math.abs(N-i)+n.length);
        }
        System.out.println(ans);
    }
}
