import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int idx = 2;
        while (true) {
            int tmp = list.get(idx-2)+idx;
            if (tmp>=1000) break;
            list.add(tmp);
            idx++;
        }
        idx = list.size()-1;
        HashSet<Integer> set = new HashSet<>(list); 
        for (int tc=1;tc<=T;tc++){
            int N = Integer.parseInt(br.readLine());
            boolean flag = false;
            for (int i=idx;i>=0;i--){
                if (list.get(i)<=N-2){
                    for (int j=i;j>=0;j--){
                        int k = N-list.get(j)-list.get(i);
                        if (set.contains(k)){
                            flag=true;
                            break;
                        }
                    }
                }
                if (flag) break;
            }
            if (flag) ans.append(1);
            else ans.append(0);
            if (tc!=T) ans.append("\n");
            
        }
        System.out.println(ans);
    }
}
