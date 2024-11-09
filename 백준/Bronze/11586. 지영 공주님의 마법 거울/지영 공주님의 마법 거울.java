import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        char[][] mirror = new char[N][N];
        for (int i = 0; i < N; i++) {
            mirror[i] = br.readLine().toCharArray();
        }
        int type = Integer.parseInt(br.readLine());
        if (type == 1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ans.append(mirror[i][j]);
                }
                ans.append("\n");
            }
        }else if (type == 2) {
            for (int i = 0; i < N; i++) {
                for (int j = N-1; j >=0; j--) {
                    ans.append(mirror[i][j]);
                }
                ans.append("\n");
            }
        }else {
            for (int i = N-1; i >=0; i--) {
                for (int j = 0; j < N; j++) {
                    ans.append(mirror[i][j]);
                }
                ans.append("\n");
            }
        }
        System.out.println(ans);

    }
}
