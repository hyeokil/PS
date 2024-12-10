import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] first  = new int[] {500, 300, 200, 50, 30, 10};
        int[] second = new int[] {512, 256, 128, 64, 32};
        for(int i=0; i<T; i++) {
            int money = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())
                    , b = Integer.parseInt(st.nextToken());
            if(a == 1)
                money += first[0];
            else if(a > 1 && a <= 3)
                money += first[1];
            else if(a > 3 && a <= 6 )
                money += first[2];
            else if(a > 6 && a <= 10)
                money += first[3];
            else if(a > 10 && a <= 15)
                money += first[4];
            else if(a > 15 && a <= 21)
                money += first[5];
            else
                money = 0;

            if(b == 1)
                money += second[0];
            else if(b > 1 && b <= 3)
                money += second[1];
            else if(b > 3 && b <= 7)
                money += second[2];
            else if(b > 7 && b <= 15)
                money += second[3];
            else if(b > 15 && b <= 31)
                money += second[4];

            ans.append(money * 10000+"\n");
        }

        System.out.println(ans);
    }

}