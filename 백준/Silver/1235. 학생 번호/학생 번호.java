import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        while (N-- > 0) {
            list.add(br.readLine());
        }
        int L = list.get(0).length();
        int ans = 1;
        while (true) {
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < list.size(); i++) {
                if (set.contains(list.get(i).substring(L-ans,L))) {
                    break;
                }
                set.add(list.get(i).substring(L-ans,L));
            }
            if (set.size() == list.size()) {
                break;
            } else {
                ans += 1;
            }
        }
        System.out.println(ans);

    }
}
