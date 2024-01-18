import java.util.*;
import java.io.*;

public class Main {
    static class Node implements Comparable<Node> {
        int index, distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return this.distance - other.distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            ArrayList<Node>[] graph = new ArrayList[N+1];
            for (int i = 0; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                graph[a].add(new Node(b, c));
                graph[b].add(new Node(a, c));
            }

            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] destinations = new int[K];
            for (int i = 0; i < K; i++) {
                destinations[i] = Integer.parseInt(st.nextToken());
            }

            int[][] dist = new int[N+1][K];
            for (int i = 0; i <= N; i++) {
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }

            for (int i = 0; i < K; i++) {
                PriorityQueue<Node> pq = new PriorityQueue<>();
                pq.offer(new Node(destinations[i], 0));
                dist[destinations[i]][i] = 0;

                while (!pq.isEmpty()) {
                    Node node = pq.poll();

                    if (node.distance > dist[node.index][i]) continue;

                    for (Node adjNode : graph[node.index]) {
                        int cost = node.distance + adjNode.distance;

                        if (cost < dist[adjNode.index][i]) {
                            dist[adjNode.index][i] = cost;
                            pq.offer(new Node(adjNode.index, cost));
                        }
                    }
                }
            }

            int res = Integer.MAX_VALUE;
            int ans = -1;
            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = 0; j < K; j++) {
                    sum += dist[i][j];
                }

                if (res > sum) {
                    res = sum;
                    ans = i;
                }
            }

            System.out.println(ans);
        }
    }
}
