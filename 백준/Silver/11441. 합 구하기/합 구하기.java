import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] lst = new int[N + 1];
        lst[0] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =1;i<=N;i++){
            lst[i] = lst[i-1] + Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        for (int i=0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(lst[b]-lst[a-1]));
            bw.newLine();
        }
        bw.close();
    }
}
