import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int[] N1 = new int[4];
        int[] N2 = new int[2];
        for (int i = 0; i < 4; i++) {
            N1[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            N2[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(N1);
        Arrays.sort(N2);
        for (int i = 1; i < 4; i++) {
            ans += N1[i];
        }
        for (int i = 1; i < 2; i++) {
            ans += N2[i];
        }
        System.out.println(ans);
    }
}
