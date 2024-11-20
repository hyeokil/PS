import java.io.*;
import java.util.*;

public class Main {
    static boolean check(int a,int n, int s, int b){
        boolean flag = false;
        int S=0,B=0;
        int h1=a/100;
        int t1 = (a-(h1*100))/10,o1 = a%10;
        int h2 = n/100;
        int t2 = (n-(h2*100))/10,o2 = n%10;
        if (h1==h2) S++;
        if (t1==t2) S++;
        if (o1==o2) S++;
        if (h1==t2 || h1 == o2) B++;
        if (t1==h2 || t1 == o2) B++;
        if (o1==h2 || o1 == t2) B++;
        if (S==s && B==b) flag = true;
        return flag;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        boolean[] nums = new boolean[1000];
        for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                if (i==j) continue;
                for (int k=1;k<10;k++){
                    if (i==k || j==k) continue;
                    int idx = i*100+j*10+k;
                    nums[idx] = true;
                }
            }
        }

        while (N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken())
            ,s = Integer.parseInt(st.nextToken())
            ,b = Integer.parseInt(st.nextToken());
            for (int i=123;i<988;i++){
                if (nums[i] && !check(i, n, s, b)) nums[i] = false;
            }
        }
        for (int i=123;i<988;i++){
            if (nums[i]) ans++;
        }
        System.out.println(ans);
    }
}
