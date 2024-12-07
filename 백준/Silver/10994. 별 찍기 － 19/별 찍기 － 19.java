import java.io.*;
import java.util.*;

public class Main {
    static char[][] res;
    static void f(int n, int l){
        if (l<=n) return;
        for (int i = n; i < l; i++){
            res[n][i] = '*';
            res[l-1][i] = '*';
            res[i][n] = '*';
            res[i][l-1] = '*';
        }
        f(n+2, l-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        N =  4*N-3;
        res = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) res[i][j] = ' ';
        }
        f(0, N);
        for (char[] cs :res){
            for (char c : cs) {
                ans.append(c);
            }
            ans.append('\n');
        }
        System.out.println(ans);
    }

}