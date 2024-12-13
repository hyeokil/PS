import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        String input = br.readLine();
        String ans = Long.toBinaryString(Long.parseLong(input));
        System.out.println(ans);
    }

}