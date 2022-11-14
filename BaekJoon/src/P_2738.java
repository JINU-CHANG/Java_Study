import java.util.Scanner;

public class P_2738 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				int x = sc.nextInt();
				A[i][j]=x;
			}
		}
		
		int[][] B = new int[N][M];
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				int x = sc.nextInt();
				B[i][j]=x;
			}
		}
		
		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(A[i][j]+B[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
