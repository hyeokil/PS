import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()),P = Integer.parseInt(st.nextToken()),sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += (size[i] / T) + (size[i] % T == 0 ? 0 : 1);
        }
        ans.append(sum+"\n"+N / P+" "+N%P);
        System.out.println(ans);

    }
}