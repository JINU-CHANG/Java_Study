
import java.util.Scanner;

public class P_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i=0; i<C;i++) {
			int studentNum = sc.nextInt();
			
			double[] scores = new double[studentNum];
			double sum=0;
			
			for(int j=0;j<studentNum;j++) {
				double studentScore = sc.nextInt();
				scores[j]=studentScore;
				sum+=studentScore;
			}
			
			double average = (sum/studentNum);

			int cnt=0;
			for(int k=0;k<studentNum;k++) {
				if(scores[k]>average) cnt++;
			}

			double percentageOfStudent = (100.0*cnt/studentNum);
			System.out.println(String.format("%.3f", percentageOfStudent)+"%");
		}
	}

}
