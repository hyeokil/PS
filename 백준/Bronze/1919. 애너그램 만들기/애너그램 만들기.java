import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S1 = br.readLine().toCharArray();
        char[] S2 = br.readLine().toCharArray();
        boolean[] visited = new boolean[S2.length];
        int ans = 0;
        for (int i = 0; i < S1.length; i++) {
            for (int j = 0; j < S2.length; j++) {
                if (S1[i] == S2[j]&&visited[j] == false) {
                    visited[j] = true;
                    ans++;
                    break;
                }
            }
        }
        System.out.println(S1.length+S2.length-ans*2);
    }
}

