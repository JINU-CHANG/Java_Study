
import java.util.Scanner;
public class P_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			
			if(x==2) {
				cnt++;
				continue;
			}
			for(int j=2;j<x;j++) {
				if(x%j==0) {
					break;
				}
				if(j==x-1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
