import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),M=Integer.parseInt(st.nextToken());
        int ans  =0, box = 0;
        if (N == 0) {
            System.out.println(ans);
            return;            
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int book = Integer.parseInt(st.nextToken());
            if (book + box <= M) {
                box += book;
            } else {
                ans++;
                box = book;
            }
        }
        if (box>0) ans++;
        System.out.println(ans);

    }
}
