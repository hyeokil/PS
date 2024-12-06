import java.io.*;
import java.util.*;

public class Main {
    static class Node{
        int x;
        int y;
        int cnt;
        Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    static int R,C;
    static int[] dx={1,-1,0,0}, dy = {0,0,-1,1};
    static String[][] forest;

    static void watering(Queue<int[]> q) {
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0],y = now[1];
            for (int i=0;i<4;i++){
                int nx = x+dx[i],ny = y+dy[i];
                if (nx<0 || ny<0 || nx>=R || ny>=C || !forest[nx][ny].equals(".")) continue;
                forest[nx][ny] = String.valueOf(Integer.parseInt(forest[x][y])+1);
                q.add(new int[]{nx,ny});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        forest = new String[R][C];
        StringBuilder ans = new StringBuilder();
        Queue<int[]> q = new LinkedList<>();
        int x=0,y=0;
        for (int i = 0; i < R; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (input[j]=='*'){
                    q.offer(new int[]{i, j});
                    forest[i][j] = "0";
                }
                else if (input[j]=='S') {
                    x = i;
                    y = j;
                    forest[i][j] = input[j]+"";
                }else forest[i][j] = input[j]+"";
            }
        }
        watering(q);
        Queue<Node> q2 = new LinkedList<>();
        q2.add(new Node(x,y,0));
        Boolean flag = false;
        int res =0;
        boolean[][] visited = new boolean[R][C];
        visited[x][y] = true;
        while(!q2.isEmpty()){
            Node node = q2.poll();
            if (forest[node.x][node.y].equals("D")){
                flag = true;
                res = node.cnt;
                break;
            }
            for (int i=0;i<4;i++){
                int nx = node.x+dx[i],ny = node.y+dy[i];
                if (nx<0 || ny<0 || nx>=R || ny>=C || visited[nx][ny] || forest[nx][ny].equals("X")) continue;
                if (forest[nx][ny].equals("D")){
                    q2.offer(new Node(nx,ny,node.cnt+1));
                    break;
                }else if (forest[nx][ny].equals(".")){
                    visited[nx][ny] = true;
                    q2.add(new Node(nx,ny,node.cnt+1));
                }else{
                    if (Integer.parseInt(forest[nx][ny])<=node.cnt+1) continue;
                    visited[nx][ny] = true;
                    q2.add(new Node(nx,ny,node.cnt+1));
                }
            }
        }
        if (flag) ans.append(res);
        else ans.append("KAKTUS");
        System.out.print(ans);

    }

}
