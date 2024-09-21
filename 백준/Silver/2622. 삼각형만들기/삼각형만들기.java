import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =0;
        int N = Integer.parseInt(br.readLine());
        for (int i=1 ; i<=N/2 ; i++){
            for (int j=i ; j<=N-i-j ; j++){
                if (i+j>N-i-j) ans++;
            }
        }
        System.out.println(ans);

    }
}
