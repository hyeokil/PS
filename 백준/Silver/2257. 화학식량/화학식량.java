import java.io.*;
import java.util.*;


public class Main {
    static int a,b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('H', 1);map.put('C', 12);map.put('O', 16);
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        char[] lst = new char[S.length()];
        for (int i = 0; i < S.length(); i++) {
            lst[i] = S.charAt(i);
        }
        for (int i = 0; i < S.length(); i++) {
            if (lst[i] == '(') {
                stack.push(0);
            }
            else if (lst[i]==')') {
                a=0;
                while (true) {
                    b = stack.pop();
                    if (b == 0) {
                        break;
                    }
                    a += b;
                }
                stack.push(a);
            }
            else if (Character.isDigit(lst[i])) {
                a = stack.pop();
                stack.push(a * Integer.parseInt(String.valueOf(lst[i])));
            }
            else {
                stack.push(map.get(lst[i]));
            }

        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        bw.write(Integer.toString(ans));
        bw.close();
    }
}
