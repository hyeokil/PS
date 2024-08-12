import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[3];
        inputs[0] = br.readLine();
        inputs[1] = br.readLine();
        inputs[2] = br.readLine();
        for (int i = 0; i < 3; i++) {
            if (inputs[i].chars().allMatch(Character::isDigit)) {
                int n = Integer.parseInt(inputs[i]);
                int tmp = n + 3 - i;
                if (tmp % 3 == 0 && tmp % 5 == 0) {
                    System.out.println("FizzBuzz");
                }else if (tmp % 3 == 0) {
                    System.out.println("Fizz");
                } else if (tmp % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(tmp);
                }
                break;
            }
        }
    }

}