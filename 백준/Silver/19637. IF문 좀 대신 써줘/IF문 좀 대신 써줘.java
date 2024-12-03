import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                ,M = Integer.parseInt(st.nextToken());
        String[] names = new String[N];
        int[] powers = new int[N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            names[i] = input[0];
            powers[i] = Integer.parseInt(input[1]);
        }
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(br.readLine());
            int s=0,e=N-1;
            while (s<=e){
                int mid = (s+e)/2;
                if (powers[mid]<n) s=mid+1;
                else e=mid-1;
            }
            ans.append(names[s]+"\n");
        }
        System.out.println(ans);
    }
}
