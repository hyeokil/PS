import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] code = br.readLine().toCharArray();
        int L = code.length;
        long[] dp = new long[L];
        dp[0]=1;
        if (code[0]=='0'){
            System.out.println(0);
            return;
        }
        for (int i=1;i<L;i++){
            int tmp = 0;
            if (code[i-1]=='1'||(code[i-1]=='2'&&code[i]<='6'))tmp++;
            if (code[i]!='0')tmp++;
            dp[i]= dp[i-1];
            if (tmp==2){
                if (i==1)dp[i]++;
                else dp[i]=(dp[i]+dp[i-2])%1000000;
            }else if (tmp==0){
                dp[L-1]=0;
                break;
            }else{
                if (code[i]=='0') {
                    if (i>1) dp[i]=dp[i-2];
                    else dp[i]=dp[i-1];
                }
            }
        }
        System.out.println(dp[L-1]);
    }
}
