import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        int b = 0, w=0;
        int r = 0;
        for (int i = 0; i < Q; i++) {
            String s = br.readLine();
            if (s.equals("push b")) {
                if (r==1) continue;
                if (r==3&& w==0) continue;
                q.addFirst(0);
                b++;
            }else if (s.equals("push w")) {
                q.addFirst(1);
                w++;
            }else if (s.equals("pop")) {
                if (!q.isEmpty()) {
                    int tmp = q.removeLast();
                    if (tmp == 0) {
                        b--;
                    } else {
                        w--;
                        if (r == 3) {
                            while (!q.isEmpty()) {
                                if (q.peekLast() == 1) {
                                    break;
                                }
                                q.removeLast();
                                b--;
                            }
                        }
                    }
                }
            }else if (s.equals("rotate l")) {
                r=(r+1)%4;
                if (r == 1) {
                    while (!q.isEmpty()) {
                        if (q.peek() == 1) {
                            break;
                        }
                        q.pop();
                        b--;
                    }
                } else if (r == 3) {
                    while (!q.isEmpty()) {
                        if (q.peekLast() == 1) {
                            break;
                        }
                        q.removeLast();
                        b--;
                    }
                }
            }else if (s.equals("rotate r")) {
                r=(r-1)>=0? r-1:3;
                if (r == 1) {
                    while (!q.isEmpty()) {
                        if (q.peek() == 1) {
                            break;
                        }
                        q.pop();
                        b--;
                    }
                } else if (r == 3) {
                    while (!q.isEmpty()) {
                        if (q.peekLast() == 1) {
                            break;
                        }
                        q.removeLast();
                        b--;
                    }
                }
            } else if (s.equals("count w")) {
                ans.append(w + "\n");
            } else {
                ans.append(b + "\n");
            }
        }
        System.out.println(ans);

    }
}
