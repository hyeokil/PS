import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder ans = new StringBuilder();
        List<String> list = new ArrayList<>();
        int R = Integer.parseInt(st.nextToken())
                , C = Integer.parseInt(st.nextToken());
        String[] puzzle = new String[R];
        for (int i = 0; i < R; i++) {
            puzzle[i] = br.readLine();
        }
        for (int i = 0; i < R; i++) {
            int s = 0,l=0;
            for (int j = 0; j < C; j++) {
                if (puzzle[i].charAt(j) != '#') {
                    if (l == 0) {
                        s = j;
                    }
                    l++;
                } else {
                    if (l > 1) {
                        list.add(puzzle[i].substring(s, s+l));
                    }
                    l = 0;
                }

            }
            if (l > 1) {
                list.add(puzzle[i].substring(s, s+l));
            }
        }
        for (int i = 0; i < C; i++) {
            String tmp = "";
            for (int j = 0; j < R; j++) {
                if (puzzle[j].charAt(i) != '#') {
                    tmp += puzzle[j].charAt(i);
                } else {
                    if (tmp.length()>1) {
                        list.add(tmp);
                    }
                    tmp = "";
                }

            }
            if (tmp.length()>1) {
                list.add(tmp);
            }
            tmp = "";
        }
        Collections.sort(list);
        ans.append(list.get(0));
        System.out.println(ans);
    }
}
