import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken()),W= Integer.parseInt(st.nextToken())
        ,N= Integer.parseInt(st.nextToken()),M= Integer.parseInt(st.nextToken());
        int a =H/(N+1), b =W/(M+1);
        a += H%(N+1)>0?1:0;
        b+=W%(M+1)>0?1:0;       
        ans = a*b;
        System.out.println(ans);
    }
}

