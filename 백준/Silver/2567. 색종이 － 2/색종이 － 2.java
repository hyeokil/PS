import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int gcd(int a,int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int[][] paper = new int[101][101];
        int[] dx = { 1,-1,0,0}, dy = { 0,0,1,-1};
        int N = Integer.parseInt(br.readLine());
        for (int k = 0; k < N; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())
                    , y = Integer.parseInt(st.nextToken());
            for (int i = 0; i <10; i++) {
                for (int j = 0; j <10; j++) {
                    paper[x+i][y+j] = 1;
                }
            }
        }
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (paper[i][j] == 1) {
                    for (int k=0;k<4;k++) {
                        int nx = i+dx[k], ny = j+dy[k];
                        if(nx>=1&&nx<=100&&ny>=1&&ny<=100 && paper[nx][ny] == 0)ans++;
                        else if(nx<1 || nx>100 || ny<1 || ny>100)ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
