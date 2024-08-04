import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);map.put('V', 5);
        map.put('X', 10);map.put('L', 50);
        map.put('C', 100);map.put('D', 500);
        map.put('M', 1000);
        StringBuilder ans = new StringBuilder();
        while (T-- > 0) {
            char[] S = br.readLine().toCharArray();
            int res = 0;
            for (char c : S) {
                if (map.containsKey(c)) {
                    res += map.get(c);
                }
            }
            ans.append(res+"\n");
        }
        System.out.println(ans);


    }
}
