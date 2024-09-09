import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            double a = Double.parseDouble(br.readLine());
            a *=0.8;
            String b = String.format("%.2f", a);
            ans.append("$" + b + "\n");
        }
        System.out.println(ans);

    }
}
