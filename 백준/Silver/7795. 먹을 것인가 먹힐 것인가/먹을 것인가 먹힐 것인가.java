import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int tc=0;tc<T;tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] lstA = new int[N];
            int[] lstB = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i=0;i<N;i++){
                lstA[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i=0;i<M;i++){
                lstB[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(lstB);
            int ans = 0;
            for (int a:lstA){
                int s=0, e =M;
                while (s<e){
                    int mid = (s + e) / 2;
                    if (lstB[mid] >= a) {
                        e = mid;
                    } else {
                        s = mid + 1;
                    }

                }
                ans += s;

            }
            bw.write(Integer.toString(ans));
            bw.newLine();
        }
        bw.close();
    }
}