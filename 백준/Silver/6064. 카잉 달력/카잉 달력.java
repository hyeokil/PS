import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < T; i++) {
            boolean flag= false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()),N=Integer.parseInt(st.nextToken()),
                    X=Integer.parseInt(st.nextToken())-1,Y=Integer.parseInt(st.nextToken())-1;
            for (int j = X; j < N*M; j+=M) {
                if (j % N == Y) {
                    ans.append(j+1+"\n");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans.append(-1+"\n");
            }
        }
        System.out.println(ans);
    }

}