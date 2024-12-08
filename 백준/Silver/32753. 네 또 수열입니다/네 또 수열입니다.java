import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , K = Integer.parseInt(st.nextToken());
        StringBuilder ans = new StringBuilder();
        if (N==1){
            for (int i = 0; i < K; i++){
                ans.append(N);
                if (i != K-1)ans.append(" ");
            }
        }else{
            if (N==2 && K==1) ans.append("1 2");
            else ans.append(-1);
        }
        System.out.println(ans);
    }
}