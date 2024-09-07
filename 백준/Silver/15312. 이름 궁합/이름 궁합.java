 import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int[] alpha = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        char[] A = br.readLine().toCharArray();
        char[] B = br.readLine().toCharArray();
        int[] arr = new int[A.length * 2];
        for (int i = 0; i < A.length; i++) {
            arr[i*2] = alpha[A[i] - 'A'];
            arr[i*2 + 1] = alpha[B[i] - 'A'];
        }
        for (int i = 1; i < A.length * 2 - 1; i++) {
            for (int j = 0; j < A.length * 2 - i; j++) {
                arr[j] = (arr[j] + arr[j + 1])%10;
            }
        }
        System.out.println(arr[0]+""+arr[1]);

    }
}


