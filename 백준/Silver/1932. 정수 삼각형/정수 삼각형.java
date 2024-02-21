import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.*;

import static java.lang.Math.max;


public class Main {
    static int a, b;
    static StringTokenizer st;
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                a=0;b=0;
                if (i >= 1) {
                    if (j == 0) {
                        a=arr[i-1][j];
                    } else if (j == i) {
                        a = arr[i - 1][j - 1];
                    } else {
                        a=arr[i-1][j];
                        b = arr[i - 1][j - 1];
                    }
                    arr[i][j] += max(a, b);
                }
            }
        }

        bw.write(Integer.toString(Arrays.stream(arr[N - 1]).max().orElse(0)));
        bw.close();

    }

}