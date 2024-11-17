import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new int[]{Integer.parseInt(input[2]), Integer.parseInt(input[0]), Integer.parseInt(input[1])});
        }
        list.sort(Arrays::compare);
        StringBuilder ans = new StringBuilder();
        ans.append(list.get(N-1)[1]+" "+list.get(N-1)[2]+"\n");
        ans.append(list.get(N-2)[1]+" "+list.get(N-2)[2]+"\n");
        int tmp = -1;
        if (list.get(N-1)[1] == list.get(N-2)[1]) tmp = list.get(N-1)[1];
        for (int i = N-3; i >=0; i--) {
            if (tmp!=list.get(i)[1]) {
                ans.append(list.get(i)[1]+" "+list.get(i)[2]);
                break;
            }
        }
        System.out.println(ans);
    }
}
