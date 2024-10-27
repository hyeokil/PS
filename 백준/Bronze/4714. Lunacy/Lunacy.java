import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        while (true) {
            double weight = Double.parseDouble(br.readLine());
            if (weight < 0) break;
            ans.append("Objects weighing "+String.format("%.2f",weight)+" on Earth will weigh ");
            ans.append(String.format("%.2f",weight*0.167)+" on the moon.\n");
        }

        System.out.println(ans);
    }
}
