import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        int H = Integer.parseInt(st.nextToken())
                ,W = Integer.parseInt(st.nextToken());
        for (int i = 0; i < H; i++) {
            char[] input = br.readLine().toCharArray();
            int cloud = -1;
            for (int j = 0; j < W; j++) {
                if (input[j] == 'c') cloud = j;
                ans.append(cloud!=-1?j-cloud:cloud);
                if (j!=W-1) ans.append(" ");
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}
