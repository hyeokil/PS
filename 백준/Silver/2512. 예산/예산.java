import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lst = new int[N];
        for (int i=0;i<N;i++){
            lst[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int sum = Arrays.stream(lst).sum();
        int ans = 0;
        if (sum <= M ) {
            ans = Arrays.stream(lst).max().getAsInt();
        }
        else{
            int s= 0; int e = M;
            while (s<e) {
                int mid = (s+e)/2;
                int res = 0;
                for (int i : lst){
                    if (i <= mid) {
                        res+=i;
                    }else{
                        res+=mid;
                    }
                }
                if (res == M){
                    ans = mid;
                    break;
                }
                else if (res < M) {
                    if (ans < mid){
                        ans = mid;
                    }
                    s = mid+1;
                }
                else{
                    e = mid;
                }
            }
        }
        System.out.println(ans);
    }
}