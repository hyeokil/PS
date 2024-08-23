import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]), W = Integer.parseInt(input[1]), C = Integer.parseInt(input[2]);
        input = br.readLine().split(" ");
        int[] A  = new int[C];
        for (int i = 0; i < C; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        int[][] ans = new int[H][W];
        int tmp = 1;
        int x = 0, y = 0;
        while (x<H) {
            ans[x][y] = tmp;
            A[tmp - 1]--;
            if (A[tmp-1] == 0) {
                tmp++;}
            if (x % 2 == 0) {
                y++;
                if (y == W) {
                    x++;y--;                }
            } else {
                y--;
                if (y < 0) {
                    x++;y++;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            System.out.println(Arrays.toString(ans[i]).replace("[","").replace("]","").replaceAll(", ",""));

        }
    }
}
