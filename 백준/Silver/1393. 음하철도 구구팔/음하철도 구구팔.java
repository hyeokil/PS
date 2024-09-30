import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int X = Integer.parseInt(st.nextToken())
                ,Y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int nowX = Integer.parseInt(st.nextToken())
                ,nowY = Integer.parseInt(st.nextToken())
                ,speedX = Integer.parseInt(st.nextToken())
                ,speedY = Integer.parseInt(st.nextToken());
        int gcd = gcd(speedX, speedY);
        speedX /= gcd; speedY /= gcd;
        int d = (X-nowX)*(X-nowX)+(Y-nowY)*(Y-nowY);
        while (true) {
            nowX += speedX;nowY += speedY;
            int tmp = (X-nowX)*(X-nowX)+(Y-nowY)*(Y-nowY);
            if (d < tmp) {
                ans.append((nowX-speedX)+" "+(nowY-speedY));
                break;
            }
            d = tmp;
        }
        System.out.println(ans);
    }
}
