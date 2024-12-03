import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            char[] input = br.readLine().toCharArray();
            ans.append("String #"+i+"\n");
            for (int j = 0; j < input.length; j++) {
                if (input[j]<'Z')ans.append((char)(input[j]+1));
                else ans.append('A');
            }
            if (i!=N) ans.append("\n\n");
        }

        System.out.println(ans);
    }
}
