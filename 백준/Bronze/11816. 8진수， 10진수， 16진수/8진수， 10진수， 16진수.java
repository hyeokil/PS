import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.charAt(0) == '0') {
            if (input.charAt(1) == 'x') {
                System.out.println(Integer.parseInt(input.substring(2), 16));
            } else {
                System.out.println(Integer.parseInt(input, 8));
            }
        } else {
            System.out.println(input);
        }
    }
}
