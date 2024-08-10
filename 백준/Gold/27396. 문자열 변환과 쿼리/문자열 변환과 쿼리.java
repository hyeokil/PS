import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] S = st.nextToken().toCharArray();
        int N = Integer.parseInt(st.nextToken());
        HashMap<Character, List<Integer>> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length; i++) {
            if (map.containsKey(S[i])) {
                map.get(S[i]).add(i);
            } else {
                map.put(S[i], new ArrayList<>());
                map.get(S[i]).add(i);
            }
        }
        for (int i = 0; i < N; i++) {
            char[] Q = br.readLine().toCharArray();
            if (Q[0] == '1'&& map.containsKey(Q[2]) && Q[2]!=Q[4]) {
                if (map.containsKey(Q[4])) {
                    for (int j : map.remove(Q[2])) {
                        map.get(Q[4]).add(j);
                        S[j] = Q[4];
                    }
                } else {
                    map.put(Q[4],map.remove(Q[2]));
                    for (int j : map.get(Q[4])) {
                        S[j] = Q[4];
                    }
                }
            } else if (Q[0] == '2') {
                ans.append(Arrays.toString(S).replace("[","").replace("]","").replaceAll(", ","")+"\n");
            }
        }
        System.out.println(ans);


    }
}