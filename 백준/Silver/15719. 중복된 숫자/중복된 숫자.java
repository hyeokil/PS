import java.io.*;

public class Main {

    static int readInt(InputStream in) throws IOException {
        int num = 0, c;
        while ((c = in.read()) <= 32); 
        do num = num * 10 + (c - '0'); while ((c = in.read()) > 32);
        return num;
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int N = readInt(in);
        boolean[] check = new boolean[N]; 
        for (int i = 0; i < N; i++) {
            int n = readInt(in);
            if (check[n]) {
                System.out.println(n);
                return;
            }
            check[n] = true;
        }
    }
}
