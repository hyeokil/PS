import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            char[] A = br.readLine().toCharArray();
            char[] B = br.readLine().toCharArray();
            int res =0;
            for (int j = 0; j < B.length; j++) {
                if (A[j] != B[j]) res++;
            }
            ans.append("Hamming distance is "+res+"."+"\n");

        }
        System.out.println(ans);
    }
}
