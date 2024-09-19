import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 네 개의 깊이 값을 입력받습니다.
        int d1 = Integer.parseInt(br.readLine())
                ,d2 = Integer.parseInt(br.readLine())
                ,d3 = Integer.parseInt(br.readLine())
                ,d4 = Integer.parseInt(br.readLine());
        
        if (d1 < d2 && d2 < d3 && d3 < d4) {
            System.out.println("Fish Rising");
        }
        else if (d1 > d2 && d2 > d3 && d3 > d4) {
            System.out.println("Fish Diving");
        }
        else if (d1 == d2 && d2 == d3 && d3 == d4) {
            System.out.println("Fish At Constant Depth");
        }
        else {
            System.out.println("No Fish");
        }
    }
}
