import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        char[] ans = arr[0];
        int ans2 = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < M; i++) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            for (int j = 0; j < N; j++) {
                if (map.containsKey(arr[j][i])) {
                    map.put(arr[j][i], map.get(arr[j][i]) + 1);
                }else{
                    map.put(arr[j][i],1);
                }
                if (max < map.get(arr[j][i])) {
                    max = map.get(arr[j][i]);
                    ans[i] = arr[j][i];
                } else if (max == map.get(arr[j][i])) {
                    if (ans[i]>='A' && ans[i]<='Z') {
                        if ( ans[i] > arr[j][i]){

                            ans[i] = arr[j][i];
                        }
                    } else {
                        ans[i] = arr[j][i];
                    }
                }
            }
            ans2 += N - max;
        }
        System.out.println(ans);
        System.out.println(ans2);
    }
}
