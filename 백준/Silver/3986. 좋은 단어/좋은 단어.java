import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack ;
        for (int i = 0; i < N; i++) {
            stack = new Stack<>();
            char[] S = br.readLine().toCharArray();
            for (int j = 0; j < S.length; j++) {
                if (!stack.isEmpty() && stack.peek() == S[j]) {
                    stack.pop();
                } else {
                    stack.push(S[j]);
                }
            }
            if (stack.isEmpty()) {
                ans++;
            }

        }
        System.out.println(ans);
    }
}