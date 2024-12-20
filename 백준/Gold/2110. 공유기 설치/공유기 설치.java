import java.io.*;
import java.util.*;

public class Main {
    static int count(int[] list,int d){
        int cnt = 1;
        int pre = list[0];
        for(int i=0;i<list.length;i++){
            if (list[i]-pre>=d){
                cnt++;
                pre = list[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken())
                , C = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) list[i] = Integer.parseInt(br.readLine());
        Arrays.sort(list);
        int s =1,e=list[N-1]-list[0]+1;
        while(s<e){
            int mid = (s+e)/2;
            if (count(list,mid) < C) e = mid;
            else s = mid+1;
        }
        System.out.println(s-1);
    }
}
