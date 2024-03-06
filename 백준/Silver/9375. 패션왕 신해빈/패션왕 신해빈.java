import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte T = Byte.parseByte(br.readLine());
        while (T-- > 0) {
            byte N = Byte.parseByte(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int i =0;i<N;i++){
                String[] A = br.readLine().split(" ");
                if (map.containsKey(A[1])) {
                    map.put(A[1], map.get(A[1]) + 1);
                } else {
                    map.put(A[1], 1);
                }

            }
            int size =map.size();
            int ans = 1;
            Collection<Integer> lst1 = map.values();
            List<Integer> lst = new ArrayList<>(lst1);
            for (int i = 0; i < size; i++) {
                ans *= (lst.get(i) + 1);
            }
            System.out.println(ans-1);

        }

    }
}
