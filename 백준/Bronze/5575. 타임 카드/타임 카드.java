import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int[] H = new int[3];
        int[] M = new int[3];
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            H[i] = Integer.parseInt(input[3])-Integer.parseInt(input[0]);
            M[i] = Integer.parseInt(input[4])-Integer.parseInt(input[1]);
            S[i] = Integer.parseInt(input[5])-Integer.parseInt(input[2]);
            if (S[i] < 0) {
                M[i]--;
                S[i] += 60;
            }
            if (M[i] < 0) {
                H[i]--;
                M[i]+=60;
            }
            ans.append(H[i]).append(" ").append(M[i]).append(" ").append(S[i]).append("\n");
        }
        System.out.println(ans);
    }
}
