import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int v;
        int t;
        public Node(int v, int t) {
            this.v = v;
            this.t = t;
        }
        @Override
        public int compareTo(Node o) {
            return v != o.v ? v - o.v : t - o.t;
        }


    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()),ans=0,cnt=0;
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nodes.add(new Node(Integer.parseInt(st.nextToken()),1));
            nodes.add(new Node(Integer.parseInt(st.nextToken()),0));
        }
        Collections.sort(nodes);
        for (Node node : nodes) {
            if (node.t == 1) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                cnt--;
            }
        }
        System.out.println(ans);

    }
}
