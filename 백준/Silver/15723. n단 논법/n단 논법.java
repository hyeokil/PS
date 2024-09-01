import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = i;
        }
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" is ");
            alphabet[input[0].charAt(0)-'a'] = input[1].charAt(0)-'a';
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" is ");
            int a = input[0].charAt(0)-'a';
            while (true) {
                if (alphabet[a] == input[1].charAt(0)-'a') {
                    ans.append("T\n");
                    break;
                }
                if (alphabet[a] == a) {
                    ans.append("F\n");
                    break;
                }
                a = alphabet[a];
            }

        }
        System.out.println(ans);
    }
}
