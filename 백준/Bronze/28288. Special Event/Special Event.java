import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][5];
        int[] lst = new int[5];
        int max = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < 5; i++) {
            int tmp = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 'Y') {
                    lst[i]++;
                    tmp++;
                }
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (lst[i] == max) {
                ans.append((i+1)+",");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans);


    }
}