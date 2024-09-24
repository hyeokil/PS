import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if (input[i].length() <6) continue;
            if (input[i].substring(input[i].length()-6,input[i].length()).equals("Cheese")) {
                set.add(input[i]);
            }
        }
        System.out.println(set.size()>=4?"yummy":"sad");
    }
}
