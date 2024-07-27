import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()),B = Integer.parseInt(br.readLine());
        System.out.println(A>=20 ? 24-A+B:B-A);

    }
}
