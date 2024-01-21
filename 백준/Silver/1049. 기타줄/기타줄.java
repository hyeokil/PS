import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int six = 1001;
        int one = 1001;
        for (int i=0;i<M;i++){
            st =new StringTokenizer(br.readLine()," ");
            six = Math.min(six,Integer.parseInt(st.nextToken()));
            one =Math.min(one,Integer.parseInt(st.nextToken()));
            }
        int ans = Math.min((N/6+1)*six,(N/6)*six+N%6*one);
        bw.write(Integer.toString(Math.min(ans,N*one)));
        bw.close();
    }

}
