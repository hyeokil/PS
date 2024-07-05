import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        char[] S = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        int A= Integer.parseInt(st.nextToken()),C= Integer.parseInt(st.nextToken()),G= Integer.parseInt(st.nextToken()),T= Integer.parseInt(st.nextToken());
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
        for (int i = 0; i < M; i++) {
            map.put(S[i],map.get(S[i])+1);
        }
        if (map.get('A') >= A && map.get('C') >= C && map.get('G') >= G && map.get('T') >= T) {
            ans++;
        }
        for (int i = M; i < N;i++ ) {
            map.put(S[i-M],map.get(S[i-M])-1);
            map.put(S[i],map.get(S[i])+1);
            if (map.get('A') >= A && map.get('C') >= C && map.get('G') >= G && map.get('T') >= T) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

