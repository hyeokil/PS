import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        byte M = Byte.parseByte(st.nextToken()), D = Byte.parseByte(st.nextToken());
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] Day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int v = 0;
        for (int i = 0; i < M; i++) {
            v += month[i];
        }
        v += D-1;
        System.out.println(Day[v%7]);
    }
}
