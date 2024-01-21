import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc=0;tc<T;tc++){

            int N = Integer.parseInt(br.readLine());
            int[] lst = new int[N+1];
            for (int _=0;_<N;_++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                lst[Integer.parseInt(st.nextToken())] =Integer.parseInt(st.nextToken());
            }
            int ans = 1,tmp = lst[1];
            for (int i =2;i<=N;i++){
                if (lst[i] < tmp){
                    ans+=1;
                    tmp = lst[i];
                }
            }
            bw.write(Integer.toString(ans));
            bw.newLine();
        }
        bw.close();
    }

}
