import java.io.*;
import java.util.*;

public class Main {
    static int[][] sudoku;
    static List<int[]> list= new ArrayList<>();
    static int L;
    static boolean flag = false;

    static boolean[] visit(int x, int y){
        boolean[] visited = new boolean[10];
        for (int i=0;i<9;i++){
            visited[sudoku[x][i]] = true;
            visited[sudoku[i][y]] = true;
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                visited[sudoku[(x/3)*3+i][(y/3)*3+j]] = true;
            }
        }
        return visited;

    }

    static void f(int index){
        if (index==L) {
            flag = true;
            return;
        }
        int x = list.get(index)[0],y=list.get(index)[1];
        boolean[] visited = visit(x, y);
        for (int i=1;i<10;i++){
            if (visited[i]) continue;
            sudoku[x][y] = i;
            f(index+1);
            if (flag) return;
            sudoku[x][y] = 0;
        }
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku = new int[9][9];
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<9;j++){
                sudoku[i][j] = Integer.parseInt(st.nextToken());
                if (sudoku[i][j] == 0) {
                    list.add(new int[]{i,j});
                }
            }
        }
        L = list.size();
        f(0);        
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                ans.append(sudoku[i][j]);
                if (j!=8) ans.append(" ");
            }
            if (i!=8)ans.append("\n");
        }
        System.out.println(ans);
    }
}
