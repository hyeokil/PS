import java.util.Scanner;

public class Main {
    static int n, k, q;
    static int[] num = new int[10001];
    static char[] who = new char[10001];
    static int[] chk = new int[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        q = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int a = sc.nextInt();
            char b = sc.next().charAt(0);
            num[i] = a;
            who[i] = b;
        }

        if (num[q] == 0) {
            System.out.println("-1");
            sc.close();
            return;
        }

        for (int i = 1; i <= k; i++) {
            if (num[q] <= num[i]) {
                chk[who[i] - 'A'] = 1;
            }
        }

        chk[0] = 1;

        for (int i = 0; i < n; i++) {
            if (chk[i] == 0) {
                System.out.print((char) (i + 'A') + " ");
            }
        }

        sc.close();
    }
}
