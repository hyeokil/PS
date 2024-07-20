import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] code = br.readLine().toCharArray();
            int V1 = 0;
            int V2 = 0;
            for (int j = 0; j < 3; j++) {
                V1 += (code[j]-'A')*Math.pow(26,(2 - j));
            }
            for (int j = 0; j < 4; j++) {
                V2+= (code[j+4]-48)*Math.pow(10,(3 - j));
            }
            ans.append(Math.abs(V1-V2)<=100 ? "nice"+"\n":"not nice"+"\n");
        }
        System.out.println(ans);

    }
}
