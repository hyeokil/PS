import java.io.*;
import java.util.*;

public class Main {
    static int priority(char c){
        if (c=='(') return 0;
        if (c == '+' || c == '-') return 1;
        else return 2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        char[] S = br.readLine().toCharArray();
        Stack<Character> st = new Stack<>();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (char c : S) {
            if (c>='A' &&  c<='Z') {
                ans.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty()) {
                    char ch = st.pop();
                    if (ch == '(') {
                        break;
                    }
                    ans.append(ch);
                }
            } else {
                while (!st.isEmpty() && priority(st.peek()) >= priority(c)) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        System.out.println(ans);

    }
}