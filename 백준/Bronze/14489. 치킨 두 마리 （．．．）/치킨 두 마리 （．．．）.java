import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
        ,M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        if (N+M>=C*2){
            ans = (N+M)-(C*2);
        }else{
            ans = (N+M);
        }
        System.out.println(ans);
    }
}
