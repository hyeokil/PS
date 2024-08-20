import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken()), D=Integer.parseInt(st.nextToken());
        System.out.println(D/(S*2)*T);
    }
}
