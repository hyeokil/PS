import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Boolean[] check = new Boolean[10001];
        Arrays.fill(check,true);
        check[0] = false; check[1] = false;
        for (int i=2;i<10001;i++){
            if (check[i]==true){
                for (int j=i+i;j<10001;j+=i){
                    check[j] =false;
                }
            }
        }
        int T = Integer.parseInt(br.readLine());
        for (int tc=0;tc<T;tc++){
            int N = Integer.parseInt(br.readLine());
            for (int i=N/2;i>=2;i--){
                if (check[i] && check[N-i]){
                    bw.write(i+" "+(N-i)+"\n");
                    break;
                }

            }

        }
        bw.close();


    }
}