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
        while (true) {
            int N = readInt();
            int M = readInt();
            if (N == 0 && M == 0) {
                break;
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N + M; i++) {
                set.add(readInt());
            }
            System.out.println(N + M - set.size());
        }

    }
}
