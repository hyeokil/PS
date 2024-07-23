import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()),K=Integer.parseInt(st.nextToken()),ans=0;
        List<Integer> lst = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N-1; i++) {
            int b = Integer.parseInt(st.nextToken());
            lst.add(b-a);
            a = b;
        }
        Collections.sort(lst);
        for (int i = 0;i<N-K;i++) ans += lst.get(i);
        System.out.println(ans);
    }
}
