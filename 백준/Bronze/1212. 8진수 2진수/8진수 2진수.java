import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] Octas = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i< Octas.length;i++) {
            String b = Integer.toBinaryString(Character.getNumericValue(Octas[i]));

            if (i != 0) {
                while (b.length() < 3) {
                    b = "0" + b;
                }
            }
            sb.append(b);

        }
        System.out.println(sb);

    }
}
