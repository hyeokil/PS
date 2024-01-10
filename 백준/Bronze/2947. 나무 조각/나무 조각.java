import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        while (true) {
            if (a==1 && b==2 && c==3 && d==4 && e==5){
                break;
            }
            if (a>b){
                int tmp = a;
                a=b;
                b=tmp;
                System.out.println(a+" "+b+" "+c+" "+d+" "+e);
            }
            if (b>c) {
                int tmp = b;
                b=c;
                c=tmp;
                System.out.println(a+" "+b+" "+c+" "+d+" "+e);
            }
            if (c>d) {
                int tmp = c;
                c=d;
                d=tmp;
                System.out.println(a+" "+b+" "+c+" "+d+" "+e);
            }
            if (d>e) {
                int tmp = d;
                d=e;
                e=tmp;
                System.out.println(a+" "+b+" "+c+" "+d+" "+e);
            }
        }

    }
}