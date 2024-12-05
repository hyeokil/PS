import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , P = Integer.parseInt(st.nextToken()),idx=2;
        int[] check = new int[Math.max(N,P)+1];
        int tmp = N,ans =0;
        check[tmp] = 1;
        boolean flag = true;
        while (flag){
            tmp = tmp*N%P;
            if (check[tmp] != 0){
                flag = false;
                ans = idx-check[tmp];
            }
            check[tmp]= idx;
            idx++;
        }
        System.out.print(ans);
    }
}
