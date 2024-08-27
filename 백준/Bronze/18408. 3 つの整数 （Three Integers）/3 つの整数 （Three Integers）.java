import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a=0,b=0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a>b?1:2);
    }
}
