import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            String[] S1 = br.readLine().split(" ");
            List<String> S = new ArrayList<>(Arrays.asList(S1));
            while (true) {
                String[] s = br.readLine().split(" ");
                if (s[0].equals("what")) {
                    break;
                }
                S.removeAll(Arrays.asList(s[2]));

            }
            System.out.println(String.join(" ", S));
        }
        }

    }
