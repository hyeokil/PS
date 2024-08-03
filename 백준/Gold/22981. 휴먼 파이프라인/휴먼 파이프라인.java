import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long ans = Long.MAX_VALUE, tmp = 0L;
        List<Long> list = new ArrayList<Long>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(list);
        for (int i = 1; i < N; i++) {
            tmp = (list.get(0) * i) + (list.get(i) * (N - i));
            ans = Math.min(ans, K % tmp == 0 ? K / tmp : K / tmp + 1);
        }
        System.out.println(ans);
    }
}
