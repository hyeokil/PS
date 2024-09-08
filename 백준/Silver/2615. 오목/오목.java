 import java.io.*;
import java.util.*;

public class Main {
    static int[][] map = new int[20][20];
    static int[] dx = {0, 1, 1,-1};
    static int[] dy = {1, 1, 0,1};
    static boolean f(int x, int y) {
        boolean flag = false;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx<0 || nx>19 || ny>19 || map[nx][ny]!=map[x][y]) continue;
            q.add(new int[]{nx, ny,dx[i],dy[i],2});
        }
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nx=now[0]+now[2], ny =now[1]+now[3],cnt = now[4];
            if (cnt == 5) {
                if (nx>=0 && nx<20 && ny <20 && map[nx][ny]==map[x][y]) continue;
                if (x-now[2]>=0 && x-now[2]<20 && y-now[3]>=0 && map[x-now[2]][y-now[3]]==map[x][y]) continue;
                flag = true;
                break;
            }
            if (nx>19 || ny >19 || map[nx][ny]!=map[x][y]) continue;
            q.add(new int[] {nx,ny,now[2],now[3],cnt+1});
        }
        return flag;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        for (int i = 1; i < 20; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int j = 1; j < 20; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < 20; i++) {
            if (flag) break;
            for (int j = 1; j < 20; j++) {
                if (map[i][j] != 0) {
                    if (f(i, j)) {
                        ans.append(map[i][j]).append("\n");
                        ans.append(i + " " + j);
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (!flag) {
            ans.append(0);
        }
        System.out.println(ans);

    }
}


