import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            map.put(st.nextToken(), 0);
        }
        while(N --> 0) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                String s = st.nextToken();
                map.put(s, map.get(s) + 1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> arr = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(arr, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : arr) {
            bw.write(entry.getKey() + ' ' + entry.getValue());
            bw.newLine();
        }
        bw.close();

    }
}
