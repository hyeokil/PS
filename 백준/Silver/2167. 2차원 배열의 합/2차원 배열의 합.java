import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] lst = new int[N][M];
        for (int i =0;i<N;i++){
            for (int j=0;j<M;j++){
                lst[i][j]= sc.nextInt();
            }
        }
        int[][] lsp = new int[N][M];
        for (int i =0;i<N;i++){
            for (int j=0;j<M;j++){
                if (j==0){
                    lsp[i][j] = lst[i][j];
                }else{
                    lsp[i][j]= lsp[i][j-1]+lst[i][j];
                }
            }
        }
        int K = sc.nextInt();
        for (int i=0;i<K;i++) {
            int x1 = sc.nextInt()-1;
            int y1 = sc.nextInt()-1;
            int x2 = sc.nextInt()-1;
            int y2 = sc.nextInt()-1;
            int ans = 0;
            for (int j=x1;j<x2+1;j++){
                ans += y1==0 ? lsp[j][y2]:lsp[j][y2]-lsp[j][y1-1];
            }
            System.out.println(ans);
        }



    }
}
