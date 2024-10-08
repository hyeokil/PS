import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char C = br.readLine().charAt(0);
        System.out.print(C=='N'||C=='n'?"Naver D2":"Naver Whale");
    }
}
