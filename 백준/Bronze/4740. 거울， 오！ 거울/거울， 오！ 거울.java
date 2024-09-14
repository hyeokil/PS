import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if(s.equals("***")) {
                break;
            }
            for(int i = 0; i< s.length(); i++) {
                ans.append(s.charAt((s.length()-1)-i));
            }
            ans.append("\n");
        }
        System.out.println(ans);

    }
}
