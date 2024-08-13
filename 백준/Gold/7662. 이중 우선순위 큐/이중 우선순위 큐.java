import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();  
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());  
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String[] Q = br.readLine().split(" ");
                int V = Integer.parseInt(Q[1]);

                if (Q[0].equals("I")) {
                    minHeap.add(V);
                    maxHeap.add(V);
                    map.put(V, map.getOrDefault(V, 0) + 1);
                } else if (Q[0].equals("D")) {
                    if (V == 1) {
                        while (!maxHeap.isEmpty()) {
                            int max = maxHeap.poll();
                            if (map.get(max) > 0) {
                                map.put(max, map.get(max) - 1);
                                break;
                            }
                        }
                    } else {
                        while (!minHeap.isEmpty()) {
                            int min = minHeap.poll();
                            if (map.get(min) > 0) {
                                map.put(min, map.get(min) - 1);
                                break;
                            }
                        }
                    }
                }
            }
            boolean flag = false;
            while (!maxHeap.isEmpty()) {
                if (map.get(maxHeap.peek()) > 0) {
                    ans.append(maxHeap.poll()+" ");
                    flag = true;
                    break;
                }
                maxHeap.poll();
            }
            if (flag){
                while (!minHeap.isEmpty()) {
                    if (map.get(minHeap.peek()) > 0) {
                        ans.append(minHeap.poll()+"\n");
                        break;
                    }
                    minHeap.poll();
                }
            }else{
                ans.append("EMPTY\n");
            }
        }

        System.out.print(ans);
    }
}
