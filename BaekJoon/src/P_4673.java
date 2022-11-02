
public class P_4673 {

	static int[] array = {10000,1000,100,10,1};
	
	public static int d(int n) {
			int result=n;
			for(int i=0;i<array.length;i++) {
				result=result + n/array[i];
				n=n%array[i];
			}
			return result;
	}
	
	public static void main(String[] args) {
		
		boolean[] num = new boolean[10001];
		
		for(int i=1; i<=10000; i++){
			int n = d(i);
			
			if(n<=10000) num[n]=true;
		}
		for(int i=1;i<=10000;i++) {
			if(num[i]==false) System.out.println(i);
		}
	}

}
