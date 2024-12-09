import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        char[] input = br.readLine().toCharArray();
        char type = 'n';
        boolean flag = false,result = true;
        for (int i = 0; i < input.length; i++) {
            if (i==0 && !(input[i] >= 'a' && input[i] <= 'z')) {
                result = false;
                break;
            }
            if (input[i] >= 'a' && input[i] <= 'z') {
                if (type == 'c') {
                    if (flag){
                        ans.append((char)(input[i]-32));
                        flag = false;
                    }else ans.append(input[i]);
                } else ans.append(input[i]);
            }
            else if (input[i]>='A' && input[i]<='Z') {
                if (type=='c') {
                    result = false;
                    break;
                }
                type = 'j';
                ans.append("_"+(char)(input[i]+32));
            } else if (input[i]=='_') {
                if (type == 'j' || flag || i==input.length-1) {
                    result = false;
                    break;
                }
                flag = true;
                type = 'c';
            }
        }
        if (!result) {
            ans = new StringBuilder();
            ans.append("Error!");
        }
        System.out.println(ans);
    }
}