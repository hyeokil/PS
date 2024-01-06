import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 1;
		while(true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			int N1 = 3*N;
			int N2;
			int N3;
			int N4;
			if (N1%2 == 0) {
				N2 = N1/2;
				N3 = 3*N2;
				N4 = N3/9;
				System.out.println(tc+". even "+N4);
			}else {
				N2 = (N1+1)/2;
				N3 = 3*N2;
				N4 = N3/9;
				System.out.println(tc+". odd "+N4);
			}
			tc +=1;
			
		}
		
		
	}

}