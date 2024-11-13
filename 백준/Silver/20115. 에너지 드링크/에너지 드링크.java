import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ans = 0;
        int N = Integer.parseInt(br.readLine());
        int[] drinks = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) drinks[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(drinks);
        ans += drinks[N-1];
        for (int i=0;i<N-1;i++) ans+=(double) drinks[i]/2;
        System.out.println(ans);
    }
}
