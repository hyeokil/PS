import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())
                , b = Integer.parseInt(st.nextToken())
                , n = Integer.parseInt(st.nextToken())
                , w = Integer.parseInt(st.nextToken());
        boolean flag = false;
        int x=-1,y=-1;
        for (int i = 1; i < n; i++) {
            if (a*i+b*(n-i)==w) {
                if (flag) {
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                    x=i;
                    y=n-i;
                }
            }
        }
        if (flag) ans.append(x+" "+y);
        else ans.append(-1);
        System.out.println(ans);
    }

}