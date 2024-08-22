import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(A);
        System.out.println(A[1]);
    }
}
