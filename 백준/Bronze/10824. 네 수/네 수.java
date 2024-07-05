import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        System.out.println(Long.parseLong(S[0]+S[1]) +Long.parseLong(S[2]+S[3]));
    }
}

