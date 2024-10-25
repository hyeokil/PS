import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double BMI = weight/(height*height);
        if (BMI < 18.5){
            ans.append("Underweight");
        } else if (BMI < 25){
            ans.append("Normal weight");
        } else {
            ans.append("Overweight");
        }
        System.out.println(ans);
    }
}
