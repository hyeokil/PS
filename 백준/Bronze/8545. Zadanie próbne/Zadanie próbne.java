import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        char[] N = br.readLine().toCharArray();
        for (int i = N.length-1; i >=0 ; i--) {
            ans.append(N[i]);
        }
        System.out.println(ans);


    }
}

