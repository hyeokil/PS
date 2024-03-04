import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[M][N];
        for (int i = 0; i < M; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int[] ans = new int[2];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == ' ') {
                    continue;
                }
                int res = 1;
                char tmp = arr[i][j];
                ArrayDeque<int[]> q = new ArrayDeque<>();
                q.add(new int[]{i, j});
                arr[i][j] = ' ';
                while (!q.isEmpty()) {
                    int[] current = q.poll();
                    int x = current[0];
                    int y = current[1];
                    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                    for (int[] direction : directions) {
                        int nx = direction[0] + x;
                        int ny = direction[1] + y;
                        if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[nx][ny] == tmp) {
                            q.add(new int[]{nx, ny});
                            arr[nx][ny] = ' ';
                            res++;
                        }
                    }
                }
                ans[tmp == 'W' ? 0 : 1] += Math.pow(res, 2);
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
