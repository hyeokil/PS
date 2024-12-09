import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i< T; i++) {
            ArrayList<Point> pointList = new ArrayList<>();
            for (int j=0; j<4; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y =Integer.parseInt(st.nextToken());
                pointList.add(new Point(x, y));
            }


            double[] len = new double[6];
            int count=0;
            for (int j=0; j<3; j++) {
                for (int k=j+1; k<4; k++) {
                    if (j==0 && k==1) len[count++] = calculate(pointList.get(j), pointList.get(k));
                    else {
                        len[count++] = calculate(pointList.get(j), pointList.get(k));
                    }
                }
            }
            boolean flag = true;


            Arrays.sort(len);

            for (int j=1; j<4; j++) {
                if (len[0] != len[j]) flag = false;
            }

            if (len[4]!=len[5]) flag = false;

            if (flag) ans.append(1);
            else ans.append(0);
            ans.append("\n");
        }
        System.out.println(ans);
    }
    static double calculate(Point point1, Point point2) {
        int dx = point1.x - point2.x;
        int dy = point1.y - point2.y;
        return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
    }

}
class Point {
    int x;
    int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}