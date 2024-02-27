//import java.io.*;
//import java.util.*;
//
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//        Map<Long, Integer> map = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            Long
//        }
//        bw.close();
//    }
//}


import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] lst = new long[N];
        for (int i = 0; i < N; i++) {
            lst[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(lst);
        int cnt = 1;
        int tmp = 1;
        long ans = lst[0];
        for (int i = 1; i < N; i++) {
            if (lst[i-1] == lst[i]) {
                cnt += 1;
            } else {
                cnt = 1;
            }
            if (tmp < cnt) {
                tmp = cnt;
                ans = lst[i];
            }
        }

        bw.write(Long.toString(ans));
        bw.close();
    }
}
