import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[1000];
        Arrays.fill(check, true);
        check[0]=check[1]=false;
        for (int i=2;i<=500;i++){
            if (!check[i]) continue;
            for (int j=i+i;j<1000;j+=i){
                check[j] = false;
            }
        }
        for (int tc=1;tc<=T;tc++){
            int N = Integer.parseInt(br.readLine());
            int a=0,b=0,c=0;
            boolean flag = false;
            for (int i=N-4;i>=2;i--){
                if (check[i]){
                    int tmp=N-i;
                    for (int j=tmp-2;j>=2;j--){
                        if (check[j]&&check[tmp-j]){
                            c=i;
                            b=j;
                            a=tmp-j;
                            flag =true;
                            break;
                        }
                    }
                    if (flag) break;                                        
                }
            }
            ans.append(flag?a+" "+b+" "+c:0);
            if (tc!=T) ans.append("\n");
        }        
        System.out.println(ans);
    }
}
