import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) {
                list.add(i+1);
            } else {
                list.add(i - a, i+1);
            }
        }
        for (int i=0;i<N;i++) {
            ans.append(list.get(i)+" ");
        }
        System.out.println(ans);

    }
}
