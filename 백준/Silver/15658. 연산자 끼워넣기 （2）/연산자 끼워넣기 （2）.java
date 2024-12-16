import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] A,B = new int[4];
    static int min= Integer.MAX_VALUE,max= Integer.MIN_VALUE;
    static void f(int k, int curV){
        if (k==N) {
            min = Math.min(min,curV);
            max = Math.max(max,curV);
            return;
        }
        for (int i=0;i<4;i++) {
            if (B[i] >0) {
                switch (i){
                    case 0:
                        B[i]-=1;
                        f(k+1,curV+A[k]);
                        B[i]+=1;
                        break;
                    case 1:
                        B[i]-=1;
                        f(k+1,curV-A[k]);
                        B[i]+=1;
                        break;
                    case 2:
                        B[i]-=1;
                        f(k+1,curV*A[k]);
                        B[i]+=1;
                        break;
                    case 3:
                        B[i]-=1;
                        f(k+1,curV/A[k]);
                        B[i]+=1;
                        break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) B[i] = Integer.parseInt(st.nextToken());
        if (N==1){
            System.out.println(A[0]);
            return;
        }
        f(1,A[0]);
        ans.append(max+"\n"+min);
        System.out.println(ans);
    }
}
