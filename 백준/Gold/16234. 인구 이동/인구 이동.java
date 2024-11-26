import java.io.*;
import java.util.*;

public class Main {
    static int N,L,R,cnt;
    static int[][] ground,visited;
    static int[] dx = {1,-1,0,0},dy = {0,0,1,-1};
    static void bfs(int x,int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = cnt;
        int res =0,tmp=0;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            res+=ground[now[0]][now[1]];
            tmp++;
            for (int k=0;k<4;k++){
                int nx = now[0]+dx[k], ny=now[1]+dy[k];
                if (nx<0 || nx>=N || ny<0 || ny>=N || visited[nx][ny]!=0) continue;
                int diff = Math.abs(ground[nx][ny]-ground[now[0]][now[1]]);
                if (diff<L || diff>R) continue;
                visited[nx][ny] = cnt;
                q.add(new int[]{nx, ny});
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (visited[i][j]==cnt)ground[i][j] = res/tmp;
            }
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        ground = new int[N][N];
        for (int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++)ground[i][j]= Integer.parseInt(st.nextToken());
        }
        boolean flag;;
        while (true) {
            flag =true;
            visited = new int[N][N];
            cnt = 1;
            for (int i=0;i<N;i++){
                for (int j=0;j<N;j++){
                    if (visited[i][j]==0){
                        for (int k =0;k<4;k++){
                            int ni = i+dx[k],nj=j+dy[k];
                            if (ni<0 || ni>=N || nj<0 || nj>=N || visited[ni][nj]!=0)continue;
                            int diff = Math.abs(ground[ni][nj]-ground[i][j]);
                            if (diff<L || diff>R) continue;
                            bfs(i,j);
                            cnt++;
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if (flag) break;   
            ans++;
        }
        System.out.println(ans);
    }
}

