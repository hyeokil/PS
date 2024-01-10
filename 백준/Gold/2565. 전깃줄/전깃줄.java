import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        for (int i=0;i<N;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        for (int i=1;i<N;i++){
            for (int j=0;j<i;j++){
                if(arr[j][1]<arr[i][1]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }
        }
        System.out.println(N-Arrays.stream(dp).max().orElse(0));



    }
}