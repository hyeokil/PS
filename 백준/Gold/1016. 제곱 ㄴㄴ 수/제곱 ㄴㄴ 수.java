import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long B = scanner.nextLong();
        long[] check = new long[(int) (B - S + 1)];
        for (int i = 0; i < check.length; i++) {
            check[i] = 1;
        }

        for (long i = 2; i <= Math.sqrt(B); i++) {
            long p = i * i;
            long startIdx = S / p;
            if (S % p != 0) {
                startIdx += 1;
            }
            for (long j = startIdx; j <= B / p; j++) {
                check[(int) (j * p - S)] = 0;
            }
        }

        long result = 0;
        for (long value : check) {
            result += value;
        }

        System.out.println(result);
    }
}
