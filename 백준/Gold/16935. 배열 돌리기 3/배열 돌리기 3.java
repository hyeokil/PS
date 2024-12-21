import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[][] f1(int[][] arr){
        int[][] res= new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for (int j=0; j< arr[0].length; j++){
                res[i][j]= arr[arr.length-1-i][j];
            }
        }
        return res;
    }
    static int[][] f2(int[][] arr){
        int[][] res= new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for (int j=0; j< arr[0].length; j++){
                res[i][j]= arr[i][arr[0].length-1-j];
            }
        }
        return res;
    }
    static int[][] f3(int[][] arr){
        int[][] res= new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++){
            for (int j=0; j<arr.length; j++){
                res[i][j]= arr[arr.length-1-j][i];
            }
        }
        return res;
    }
    static int[][] f4(int[][] arr){
        int[][] res= new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++){
            for (int j=0; j<arr.length; j++){
                res[i][j]= arr[j][arr[0].length-1-i];
            }
        }
        return res;
    }
    static int[][] f5(int[][] arr){
        int[][] res= new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length/2; i++){
            for (int j=0; j< arr[0].length/2; j++){
                res[i][arr[0].length/2+j]= arr[i][j];
                res[arr.length/2+i][arr[0].length/2+j]= arr[i][arr[0].length/2+j];
                res[arr.length/2+ i][j]= arr[arr.length/2+i][arr[0].length/2+j];
                res[i][j]= arr[arr.length/2+ i][j];

            }
        }
        return res;
    }
    static int[][] f6(int[][] arr){
        int[][] res= new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length/2; i++){
            for (int j=0; j< arr[0].length/2; j++){
                res[arr.length/2+i][j]= arr[i][j];
                res[i][j]= arr[i][arr[0].length/2+j];
                res[i][arr[0].length/2+j]= arr[arr.length/2+i][arr[0].length/2+j];
                res[arr.length/2+i][arr[0].length/2+j]= arr[arr.length/2+ i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int q = Integer.parseInt(st.nextToken());
            switch (q){
                case 1:
                    arr = f1(arr);
                    break;
                case 2:
                    arr = f2(arr);
                    break;
                case 3:
                    arr = f3(arr);
                    break;
                case 4:
                    arr = f4(arr);
                    break;
                case 5:
                    arr = f5(arr);
                    break;
                case 6:
                    arr = f6(arr);
                    break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans.append(arr[i][j]);
                if (j != arr[0].length - 1) ans.append(" ");
            }
            if (i != arr.length - 1) ans.append("\n");
        }
        System.out.println(ans);
    }
}
