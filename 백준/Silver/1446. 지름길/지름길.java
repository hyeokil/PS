import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][3];
        for (int i=0;i<N;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int[] dp =new int[M+1];
        for (int i=0;i<=M;i++){
            dp[i] = i;
        }
        Arrays.sort(arr, Comparator.comparingInt(x -> x[1]));

        for (int[] lst:arr) {
            if (lst[1] > M){
                continue;
            }
            if (dp[lst[1]] > dp[lst[0]]+lst[2]){
                dp[lst[1]] = dp[lst[0]]+lst[2];
                for (int j=lst[1]+1;j<=M;j++){
                    dp[j] = dp[j-1]+1;
                }
            }
        }
        System.out.println(dp[M]);
    }
}
