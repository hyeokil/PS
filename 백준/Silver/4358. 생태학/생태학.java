import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        while ((S = br.readLine()) != null && !S.isEmpty()) {
            if (map.containsKey(S)) {
                map.put(S, map.get(S) + 1);
            }else {
                map.put(S, 1);
            }
            cnt++;
        }
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            ans.append(key+" "+String.format("%.4f",(float)map.get(key)/cnt*100)+"\n");
        }
        System.out.println(ans);
    }
}

