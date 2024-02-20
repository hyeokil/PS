import java.io.*;
import java.util.*;


public class Main {
    static int x,y,nx,ny;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        Boolean[][] visited = new Boolean[N][M];
        for (int i = 0; i < N; i++) {
            String lst = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = lst.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], false);
        }
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int ansO = 0, ansV=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) {continue;}
                int o = 0, v = 0;
                if (arr[i][j] == 'o') {o+=1;}
                else if (arr[i][j] == 'v') {v+=1;}
                else{continue;}
                Queue<int[]> q = new ArrayDeque<>();
                q.add(new int[]{i, j});
                visited[i][j] = true;
                while (!q.isEmpty()) {
                    int[] info = q.poll();
                    x = info[0];
                    y = info[1];
                    for (int d = 0; d < 4; d++) {
                        nx = dir[d][0] + x;
                        ny = dir[d][1] + y;
                        if (0 > nx || nx>=N || 0>ny || ny>=M) {continue;}
                        if (arr[nx][ny] == '#') {continue;}
                        if (visited[nx][ny]){continue;}
                        visited[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                        if (arr[nx][ny] == 'o') {o+=1;}
                        else if (arr[nx][ny] == 'v') {v+=1;}
                    }
                }
                if (o > v) {ansO+=o;}
                else {ansV += v;}


            }
        }
        bw.write(ansO+" "+ansV);
        bw.close();
    }
}