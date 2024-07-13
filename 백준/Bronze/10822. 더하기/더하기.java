import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lst = br.readLine().split(",");
        int ans = 0;
        for (int i = 0; i < lst.length; i++) {
            ans+=Integer.parseInt(lst[i]);
        }
        System.out.println(ans);
    }
}

