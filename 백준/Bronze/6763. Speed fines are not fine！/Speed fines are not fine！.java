import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())
                ,M = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        int V = N-M;
        if (V < 0) {
            if (M - N <= 20) {
                ans.append("You are speeding and your fine is $100.");
            } else if (M - N <= 30) {
                ans.append("You are speeding and your fine is $270.");
            } else {
                ans.append("You are speeding and your fine is $500.");
            }
        } else {
            ans.append("Congratulations, you are within the speed limit!");
        }
        System.out.println(ans);
    }
}
