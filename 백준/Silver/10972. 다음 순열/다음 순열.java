import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static boolean next(int[] list){
        int i = list.length-1;
        while (i>0 && list[i] <= list[i-1]) {i--;}
        if (i==0) return false;

        int j = list.length-1;
        while (list[i-1] >= list[j]) {j--;}
        int tmp = list[i-1];
        list[i-1] = list[j];
        list[j] = tmp;
        j = list.length-1;
        while (i<j) {
            tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        if (next(list)){
            for (int i=0;i<N;i++){
                ans.append(list[i]);
                if (i!=N-1){
                    ans.append(" ");
                }
            }
        }else{
            ans.append(-1);
        }
        System.out.println(ans);
    }
}
