import java.io.*;

public class Main {

    private static long getPowOfDistance(int[] point, int x, int y, int z) {
        int a = point[0] - x;
        int b = point[1] - y;
        int c = point[2] - z;
        return 1L * a * a + 1L * b * b + 1L * c * c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
            points[i][2] = Integer.parseInt(input[2]);
        }

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            String[] query = br.readLine().split(" ");
            int x = Integer.parseInt(query[0]);
            int y = Integer.parseInt(query[1]);
            int z = Integer.parseInt(query[2]);
            int r = Integer.parseInt(query[3]);
            long rSq = 1L * r * r;
            int count = 0;

            for (int[] point : points) {
                if (getPowOfDistance(point, x, y, z) <= rSq) {
                    count++;
                }
            }
            ans.append(count).append('\n');
        }
        System.out.print(ans);
    }
}
