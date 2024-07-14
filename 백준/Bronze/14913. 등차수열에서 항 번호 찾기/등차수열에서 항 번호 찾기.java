import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()),D =Integer.parseInt(st.nextToken()),K = Integer.parseInt(st.nextToken());
        System.out.println((K-A)%D==0 && (K-A)/D>=0 ? (K-A)/D+1 : "X");

    }
}

