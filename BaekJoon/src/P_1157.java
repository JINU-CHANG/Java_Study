

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class P_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		word = word.toUpperCase();
		
		ArrayList<Character> array = new ArrayList<>();
		
		for(int i=0; i<word.length();i++) {
			
			if(array.size()==0) array.add(word.charAt(i));
			else {
				
				if(array.contains(word.charAt(i))) {
					continue;
				}else {
					array.add(word.charAt(i));
				}
			}
		}
		
		int[] countArray = new int[array.size()];
		int cnt=0;
		for(int i=0; i<array.size();i++) {
			for(int j=0; j<word.length();j++) {
				if(array.get(i)==word.charAt(j)) cnt++;
			}
			countArray[i] = cnt;
			
			cnt = 0;
		}
		int maxIdx=0;
		int max=0;
		boolean overlap=false;
		for(int i=0; i<countArray.length;i++) {
			if(countArray[i]>max) {
				maxIdx = i;
				max = countArray[i];
				overlap=false;
			}else if(countArray[i]==max) {
				overlap=true;
			}
		}
		
		if(overlap==true) {
			System.out.println("?");
		}else {
			System.out.println(array.get(maxIdx));
		}

		sc.close();
	}

}
