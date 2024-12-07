import java.io.*;
import java.util.*;

public class Main {
    static class Node{
        int x;
        int time;
        int clipboard;
        Node(int x, int time,int clipboard){
            this.x = x;
            this.time = time;
            this.clipboard = clipboard;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ans =0;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(1, 0,0));
        boolean[][] visited = new boolean[N+10][N+10];
        visited[1][0] = true;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.x==N){
                ans = node.time;
                break;
            }
            if (node.x != node.clipboard && !visited[node.x][node.x]) {
                q.add(new Node(node.x, node.time+1, node.x));
                visited[node.x][node.x] = true;
            }
            int nx = node.x+node.clipboard;
            if (node.clipboard!=0 && nx<=N+9 && !visited[nx][node.clipboard]) {
                q.add(new Node(nx, node.time+1, node.clipboard));
                visited[nx][node.clipboard] = true;
            }
            if (node.x>1 && !visited[node.x-1][node.clipboard]) {
                q.add(new Node(node.x-1, node.time+1, node.clipboard));
                visited[node.x-1][node.clipboard] = true;
            }
        }

        System.out.println(ans);
    }

}