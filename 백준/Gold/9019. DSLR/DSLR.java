import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            boolean[] visited=new boolean[10000];
            String[] res=new String[10000];
            Arrays.fill(res, "");
            Queue<Integer> q=new LinkedList<>();
            q.add(A);
            visited[A]=true;
            while(!q.isEmpty()){
                int N=q.poll();
                if (N==B) break;
                int D=(N*2)%10000;
                int S= (N==0)?9999:N-1;
                int L=(N%1000)*10+N/1000;
                int R=(N%10)*1000+N/10;
                
                if(!visited[D]){
                    q.add(D);
                    visited[D]=true;
                    res[D]=res[N]+"D";
                }
                
                if(!visited[S]){
                    q.add(S);
                    visited[S]=true;
                    res[S]=res[N]+"S";
                }
                
                if(!visited[L]){
                    q.add(L);
                    visited[L]=true;
                    res[L]=res[N]+"L";
                }
                
                if(!visited[R]){
                    q.add(R);
                    visited[R]=true;
                    res[R]=res[N]+"R";
                }
            }
            ans.append(res[B]);
            if (t!=T-1) ans.append("\n");
        }
        System.out.println(ans);
    }
}

