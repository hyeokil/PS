import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken()), res = 0L,tmp=0L,ans;
        long[] list = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            list[i] = (Long.parseLong(st.nextToken()));
        }
        Arrays.sort(list);
        for (int i=1; i<N; i++) {
            tmp=(list[0]*i)+(list[i]*(N-i));
            res = Math.max(res, tmp);
        }
        ans = K%res==0?K/res:K/res+1;
        System.out.println(ans);

    }
}
