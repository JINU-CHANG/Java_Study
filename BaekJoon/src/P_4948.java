import java.util.Scanner;

public class P_4948 {

	
	public static void main(String[] args) {
		//시간 단축이 중요한 문제
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int cnt=0;
			boolean[] prime = new boolean[2*n+1];
			
			isPrime(n, prime);
			
			for(int i=n+1;i<prime.length;i++) {
				if(prime[i]==false) cnt++;
			}
			System.out.println(cnt);
		}
		
	}
	
	static void isPrime(int n, boolean[] prime) {
		prime[0]=true;
		prime[1]=true;
		
		for(int i=2; i<=Math.sqrt(2*n);i++) {
			if(prime[i]==true) continue;
			
			for(int j=i*i;j<=2*n;j+=i) {
				if(prime[j]==true) continue;
				
				prime[j]=true;
			}
		}
	}
}
