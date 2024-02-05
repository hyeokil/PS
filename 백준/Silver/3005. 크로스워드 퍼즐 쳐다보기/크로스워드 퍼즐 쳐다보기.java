import java.io.*;
import java.util.*;

public class Main {

    static String res = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),M=Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            res = "";
            for (int j = 0; j < M; j++) {
                if (arr[i].charAt(j) == '#'){
                    if (res.length() > 1) {
                        set.add(res);
                    }
                    res = "";
                }
                else{
                    res += arr[i].charAt(j);
                }
            }
            if (res.length() > 1) {
                set.add(res);}
        }
        for (int i = 0; i < M; i++) {
            res = "";
            for (int j = 0; j < N; j++) {
                if (arr[j].charAt(i) == '#'){
                    if (res.length() > 1) {
                        set.add(res);
                    }
                    res = "";
                }
                else{
                    res += arr[j].charAt(i);
                }
            }
            if (res.length() > 1) {
                set.add(res);}
        }
        ArrayList<String> lst = new ArrayList<>(set);
        Collections.sort(lst);
        bw.write(lst.get(0));
        bw.close();
    }
}
