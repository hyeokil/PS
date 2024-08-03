import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken()), res = 0L,tmp=0L,ans;
        List<Long> list = new ArrayList<Long>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(list);
        for (int i=1; i<N; i++) {
            tmp=(list.get(0)*i)+(list.get(i)*(N-i));
            res = Math.max(res, tmp);
        }
        ans = K%res==0?K/res:K/res+1;
        System.out.println(ans);

    }
}
