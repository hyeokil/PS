import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i=1;i<=N;i++){
            ans += i*(i+1);
            for (int j=1;j<=i;j++){
                ans+=j;
            }

        }
        bw.write(Integer.toString(ans));
        bw.close();
    }   

}