import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);
        boolean solved = true;
        if (firstChar.length != secondChar.length) return false;
        for (int i = 0; i < firstChar.length; i++) {
            if (firstChar[i] != secondChar[i]) {
                solved = false;
                break;
            }
        }
        if (solved) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
