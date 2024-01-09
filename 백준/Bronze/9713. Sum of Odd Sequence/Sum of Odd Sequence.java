import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j =1;j<=N;j++) {
                if (j%2==1) {
                    ans+=j;
                }
            }
            System.out.println(ans);
        }
    }
}