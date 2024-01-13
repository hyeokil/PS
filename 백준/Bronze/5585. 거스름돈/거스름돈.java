import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1000-Integer.parseInt((br.readLine()));
        int[] coins = {500,100,50,10,5,1};
        int ans = 0;
        for (int coin:coins) {
            if (N >= coin) {
                ans += N/coin;
                N %= coin;
            }
        }
        System.out.println(ans);
    }
}
