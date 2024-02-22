import java.io.*;
import java.util.*;



public class Main {
    static int readInt() throws IOException {
        int val = 0;
        do {
            int c = System.in.read();
            if (c == ' ' || c == '\n') break;
            val = 10*val + c-48;
        } while (true);
        return val;
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int[] lst = new int[N];
        int now =0;
        int ans =0;
        for (int i = 0; i < N; i++) {
            lst[i] = readInt();
        }
        Arrays.sort(lst);
        for (int i = 0; i < N; i++) {
            if (now < lst[i]) {
                now = lst[i] + M - 1;
                ans += 1;
            }
        }
        System.out.println(ans);
        
    }
}
