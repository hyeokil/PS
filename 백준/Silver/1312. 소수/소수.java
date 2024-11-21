import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken())
        ,B = Integer.parseInt(st.nextToken())
        ,N = Integer.parseInt(st.nextToken()),cnt=0;
        A%=B;
        while (true) {
            if (A==0) break;
            cnt++;
            int tmp = (A*10)/B;
            A=(A*10)%B;
            if (N==cnt) {
                ans = tmp;
                break;
            }
        }
        System.out.println(ans);
    }
}
