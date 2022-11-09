import java.util.Scanner;

class Prime{
	
	static boolean[] prime = new boolean[10001];
	static void isPrime(boolean[] p) {
		p[0]=true;
		p[1]=true;
		
		for(int i=2;i<=Math.sqrt(10000);i++) {
			if(p[i]==true) continue;
			
			for(int j=i*i; j<=10000;j+=i) {
				if(p[j]==true) continue;
				
				p[j]=true;
			}
		}
	}
}
public class P_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Prime.isPrime(Prime.prime);
		
		int T = sc.nextInt();
		
		while(T>0) {
			//골드바흐 파티션 출력
			int n = sc.nextInt(); //짝수
			
			for(int i=n/2;i>=2;i--) {
				if(Prime.prime[i]==true) continue;
				if(Prime.prime[n-i]==true) continue;
				
				System.out.println(i+" "+(n-i));
				break;
			}
			
			T--;
		}
		
	
	}
	
	
}

