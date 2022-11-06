import java.util.Scanner;
public class P_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numOf5 = 0;
		int numOf3=5000;
		
		for(int i=0; i<=(N/5);i++) {
			if((N-i*5)%3==0) {
				if((N-i*5)/3<numOf3){
					numOf3 = (N-(i*5))/3 ;
					numOf5 = i;
				}
			}
		}
		
		if(numOf3==5000) {
			System.out.println(-1);
		}else {
			System.out.println(numOf5+numOf3);
		}
		
	}

}
