import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        char[] S = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(S[0]);
        for (int i = 1; i < N; i++) {
            while (K > 0 && !stack.isEmpty() && stack.peek() <S[i]) {
                K--;
                stack.pop();
            }
            stack.push(S[i]);
        }
        for (int i = 0; i < stack.size()-K; i++) {
            ans.append(stack.get(i));
        }
        System.out.println(ans);
    }
}

