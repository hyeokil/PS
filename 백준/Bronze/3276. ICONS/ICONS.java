import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i < 11; i++) {
            if (i*i>=N){
                for (int j = i; j >=0 ; j--) {
                    if (i * j < N) {
                        System.out.println(i+" "+(j+1));
                        return;
                    }
                }
            }
        }
    }
}
