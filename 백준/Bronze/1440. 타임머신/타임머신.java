import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i==j || j==k || k==i)continue;
                    if (0<N[i] && N[i]<13 && N[j]<60 && N[k]<60) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
