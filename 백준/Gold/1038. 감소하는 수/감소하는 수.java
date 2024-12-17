import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Long> list = new ArrayList<>();
    static void f(long V) {
        list.add(V);
        for (int i = 0; i<V%10;i++) f(V*10+i);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        N =Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; i++) f(i);
        Collections.sort(list);
        try {ans.append(list.get(N));}
        catch (Exception e) {ans.append(-1);}
        System.out.println(ans);
    }
}

