import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static void change(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = -1;
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            if (i>0 && list[i]<list[i-1]) a = i;
        }
        if (a==-1){
            ans.append(-1);
        }else{
            int b = N-1;
            while (list[a-1] < list[b]) b--;
            change(list, a-1, b);
            b = N-1;
            while (a<b){
                change(list, a, b);
                a++;
                b--;
            }
            for (int i = 0; i < N; i++) ans.append(list[i]+" ");
        }
        System.out.println(ans);
    }
}
