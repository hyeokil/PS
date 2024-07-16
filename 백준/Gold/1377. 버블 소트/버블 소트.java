import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(new int[] { Integer.parseInt(br.readLine()), i});
        }
        Collections.sort(arr,(o1, o2) -> (o1[0]-o2[0]));
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, arr.get(i)[1]-i+1);
        }
        System.out.println(ans);
    }
}

