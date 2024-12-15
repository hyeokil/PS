import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken())
                , P1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double R = Double.parseDouble(st.nextToken())
                , P2 = Double.parseDouble(st.nextToken());
        double X =A/P1, Y =Math.PI*R*R/P2;
        if(X < Y) ans.append("Whole pizza");
        else ans.append("Slice of pizza");
        System.out.println(ans);
    }
}
