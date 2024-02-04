import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.max;
import static java.lang.Integer.min;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int maxA=0,maxB=0,maxC=0,minA=0,minB=0,minC=0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()),
                    b=Integer.parseInt(st.nextToken()),
                    c=Integer.parseInt(st.nextToken());
            int A = a + max(maxA, maxB), B = b + max(max(maxA, maxB), maxC), C = c + max(maxB, maxC);
            maxA = A;maxB = B;maxC = C;
            A = a + min(minA, minB); B = b + min(min(minA, minB), minC); C = c + min(minB, minC);
            minA = A;minB = B;minC = C;

        }
        bw.write(Integer.toString(max(max(maxA,maxB),maxC))+" "+min(min(minA,minB),minC));
        bw.close();
    }
}
