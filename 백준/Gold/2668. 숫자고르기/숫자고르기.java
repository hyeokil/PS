import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] lst = new int[N+1];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            set.add(a);
            lst[i + 1] = a;
        }
        while (true) {
            Set<Integer> tmp = new HashSet<>();
            for (Integer i : set) {
                tmp.add(lst[i]);
            }
            if (tmp.size() == set.size()) {
                break;
            }
            set = tmp;
        }
        List<Integer> ans = new ArrayList<>(set);
        System.out.println(ans.size());
        Collections.sort(ans);
        for (Integer i : ans) {
            System.out.println(i);
        }



    }
}

