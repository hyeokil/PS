import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>();
        for (int i=0; i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek()[0]>=n) break;
                list[stack.pop()[1]] = n;
            }
            stack.push(new int[]{n,i});
        }
        for (int i=0;i<N;i++){
            if (list[i] == 0) list[i]=-1;
            ans.append(list[i]);
            if (i!=N-1) ans.append(" ");
        }
        System.out.println(ans);
    }
}
