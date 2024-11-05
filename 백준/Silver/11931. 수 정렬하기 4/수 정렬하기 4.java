import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for (int i=0;i<N;i++) list[i] = -Integer.parseInt(br.readLine());
        Arrays.sort(list);
        for (int n:list) ans.append(-n+"\n");
        System.out.println(ans);
    }
}
