import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int belt = 0,tmp = 1;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    , b = Integer.parseInt(st.nextToken())
                    , s = Integer.parseInt(st.nextToken());

            if(s == 1) {
                if(belt == 0) belt = 1;
                else if(belt == 1) belt = 0;
            }
            tmp = (tmp / a) * b;
        }
        ans.append(belt+" "+tmp);
        System.out.println(ans);
    }

}