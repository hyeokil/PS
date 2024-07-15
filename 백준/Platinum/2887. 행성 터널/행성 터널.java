import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int X;
        int Y;
        int V;
        public Node(int X, int Y, int V) {
            super();
            this.X = X;
            this.Y = Y;
            this.V = V;
        }
        @Override
        public int compareTo(Node o) {
            return this.V - o.V;
        }
    }

    static int[] parents;

    static int  find(int a) {
        if (a != parents[a]) {
            parents[a] = find(parents[a]);
        }
        return parents[a];
    }

    static boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parents[b] = a;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<int[]> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            lst.add(new int[]{x, y, z,i});
        }
        Queue<Node> q = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            int idx = i;
            Collections.sort(lst, (o1, o2) ->(o1[idx]-o2[idx]));
            for (int j = 1; j < N; j++) {
                int[] tmp1 = lst.get(j-1);
                int[] tmp2 = lst.get(j);
                int dist = Math.abs(tmp1[i] - tmp2[i]);
                q.add(new Node(tmp1[3], tmp2[3], dist));
            }
        }
        parents = new int[N];
        for (int i = 0; i < N; i++) {
            parents[i] = i;
        }

        int ans =0;
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (union(node.X,node.Y)) {
                ans+=node.V;
            }
        }
        System.out.println(ans);

    }
}

