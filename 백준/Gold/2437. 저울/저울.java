import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> lst = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lst.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(lst);
        int check = 1;
        for (Integer n:lst) {
            if (n > check) {
                break;
            }
            check+=n;
        }
        System.out.println(check);


    }
}

