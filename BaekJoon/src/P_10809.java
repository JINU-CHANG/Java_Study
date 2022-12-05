import java.util.Scanner;
public class P_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=-1; //-1로 초기화
		}
		
		String word = sc.next();
		
		for(int i=97; i<123; i++) {
			for(int j=0; j<word.length();j++) {
				if(arr[i-97]!=-1) continue;
				
				if((char)i==word.charAt(j)) {
					arr[i-97]=j;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
