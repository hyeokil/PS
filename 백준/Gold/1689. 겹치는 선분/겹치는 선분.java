import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()),ans=0,cnt=0;
        List<int[]> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nodes.add(new int[]{Integer.parseInt(st.nextToken()),1});
            nodes.add(new int[]{Integer.parseInt(st.nextToken()),0});
        }
        nodes.sort(Arrays::compare);
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i)[1] == 1) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                cnt--;
            }
        }
        System.out.println(ans);

    }
}
