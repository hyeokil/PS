import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()),B = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                ans.append("*");
            }
            ans.append("\n");
        }
        System.out.println(ans);


    }
}
