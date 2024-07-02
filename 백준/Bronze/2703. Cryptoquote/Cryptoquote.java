import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] code = br.readLine().toCharArray();
            char[] hint = br.readLine().toCharArray();
            for (int i = 0; i < code.length; i++) {
                if (code[i] == ' ') {continue;}
                code[i] = hint[code[i] - 'A'];
            }
            System.out.println(code);
        }


    }
}

