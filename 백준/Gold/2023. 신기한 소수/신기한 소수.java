import java.io.*;

public class Main {
    static StringBuilder ans = new StringBuilder();
    static int N ;
    static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    static void f(int k, int cur) {
        if (k==N) {
            if (isPrime(cur)) {
                ans.append(cur+"\n");
            }
            return;
        }
        for (int i =1 ;i<10;i+=2) {
            int V = cur * 10 + i;
            if (isPrime(V)) {
                f(k+1, V);
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] primes = {2, 3, 5, 7};
        for (int prime : primes) {
            f(1, prime);
        }
        System.out.println(ans);
    }
}

