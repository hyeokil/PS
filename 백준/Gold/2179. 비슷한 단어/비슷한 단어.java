import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 1;
        String now = "";
        int S = Integer.MAX_VALUE;
        HashMap<String,Queue<Integer>> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
            if (words[i].length()<max) continue;
            for (int j = max;j <= words[i].length(); j++) {
                if (map.containsKey(words[i].substring(0, j))) {
                    int tmp = map.get(words[i].substring(0, j)).peek();
                    if (words[tmp].equals(words[i]) || map.get(words[i].substring(0, j)).size() >1) continue;
                    if (max < j) {
                        map.get(words[i].substring(0, j)).add(i);
                        max = j;
                        now = words[i].substring(0, j);
                        S = tmp;
                    } else {
                        if (S > tmp) {
                            map.get(words[i].substring(0, j)).add(i);
                            max = j;
                            now = words[i].substring(0, j);
                            S = tmp;
                        }
                    }


                } else {
                    map.put(words[i].substring(0, j), new LinkedList<>());
                    map.get(words[i].substring(0, j)).add(i);
                }
            }
        }
        if (now != "") {
            ans.append(words[map.get(now).poll()] + "\n" + words[map.get(now).poll()]);
        }
        System.out.println(ans);
    }
}
