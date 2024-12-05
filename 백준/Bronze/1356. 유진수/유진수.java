import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int L = N.length();
        for (int i = 1; i < L; i++) {
            String left = N.substring(0, i);
            String right = N.substring(i, L);
            int l = 1;
            int r = 1;
            for (int j = 0; j < left.length(); j++) {
                l *= Integer.parseInt(left.charAt(j) + "");
            }
            for (int j = 0; j < right.length(); j++) {
                r *= Integer.parseInt(right.charAt(j) + "");
            }
            if (l == r) {
                System.out.print("YES");
                return;
            }
        }

        System.out.print("NO");

    }

}
