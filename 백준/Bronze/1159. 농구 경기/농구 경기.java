import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<Character, Integer> map = new TreeMap<>();
        while (N-- > 0) {
            char[] S = br.readLine().toCharArray();
            if (map.containsKey(S[0])) {
                map.put(S[0], map.get(S[0]) + 1);
            } else {
                map.put(S[0], 1);
            }
        }
        String ans = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                ans+=entry.getKey();
            }
        }
        if (ans.equals("")) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(ans);
        }

    }
}
