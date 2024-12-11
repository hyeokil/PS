import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        int ans = 0;
        Stack<String> stack = new Stack<>();
        char[] input = br.readLine().toCharArray();
        boolean flag = true;
        for (int i = 0; i < input.length; i++) {
            if (!flag) break;
            if (input[i] == '(' || input[i] == '[') stack.push(input[i]+"");
            else if (input[i] == ')'){
                int res = 0;
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    String s = stack.pop();
                    if (s.equals("[")) {
                        flag = false;
                        break;
                    }else {
                        res += Integer.parseInt(s);
                    }
                }
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                };
                stack.pop();
                if (res==0){
                    stack.push(String.valueOf(2));
                }else{
                    stack.push(String.valueOf(res*2));
                }
            }else if (input[i] == ']'){
                int res = 0;
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    String s = stack.pop();
                    if (s.equals("(")) {
                        flag = false;
                        break;
                    }else {
                        res += Integer.parseInt(s);
                    }
                }
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                };
                stack.pop();
                if (res==0){
                    stack.push(String.valueOf(3));
                }else{
                    stack.push(String.valueOf(res*3));
                }
            }
        }
        while (!stack.isEmpty()){
            String s = stack.pop();
            if (s.equals("[") || s.equals("(")) {
                flag = false;
                break;
            }else{
                ans += Integer.parseInt(s);
            }
        }
        if (!flag) ans = 0;
        System.out.println(ans);
    }

}