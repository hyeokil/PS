import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[10], B = new int[10];
        for (int i = 0; i < 10; i++) A[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) B[i] = Integer.parseInt(st.nextToken());
        int a=0,b=0;
        int last = 0;
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                a += 3;
                last = 1;
            }
            else if (A[i] < B[i]) {
                b+=3;
                last=2;
            }
            else{
                a++;
                b++;
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(a+" "+b+"\n");
        if (a>b)ans.append("A");
        else if (b>a)ans.append("B");
        else {
            if (last==1)ans.append("A");
            else if (last==2)ans.append("B");
            else ans.append("D");
        }
        System.out.println(ans);
    }
}
